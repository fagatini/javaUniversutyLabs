import interfaces.programist;
import InjectorUtility.AutoInjectable;
import interfaces.mathematician;
import interfaces.physicist;

 //класс который вызывает методы, которые предопределил injector

public class SomeBean 
{   
    @AutoInjectable
    private programist programist;
    @AutoInjectable
    private mathematician mathematician;
    @AutoInjectable
    private physicist physicist;    

    public void foo()
    {
        mathematician.doCalculation();
        programist.doCalculation();
        physicist.doCalculation();
    }
}
