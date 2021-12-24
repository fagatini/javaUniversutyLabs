package InjectorUtility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Injector 
{
    private final Properties APPproperties = new Properties();

    public Injector() 
    {
        File f = new File("src/main/resources/app.properties");
        try 
        {
            APPproperties.load(new FileReader(f));
        } catch (IOException e) 
        {
            e.printStackTrace();
        }   
    }


    //определяет класс, который нужно будет использовать при помощи APPproperties
    public <T> T inject(T object) 
    {
        for (Field fieldOfObject : object.getClass().getDeclaredFields()) 
        {
            if (fieldOfObject.isAnnotationPresent(AutoInjectable.class) && fieldOfObject.getType().isInterface()) 
            {
                Class<?> storageOfChoosenMethod = null;
                try 
                {
                    storageOfChoosenMethod = Class.forName(APPproperties.getProperty(fieldOfObject.getName()));
                    if(fieldOfObject.getType().isAssignableFrom(storageOfChoosenMethod))
                    {
                        fieldOfObject.setAccessible(true);
                        fieldOfObject.set(object, storageOfChoosenMethod.getConstructor().newInstance());
                    }
                } catch (ClassNotFoundException | InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
        return object;  
    }
}
