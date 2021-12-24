package InjectorUtility;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//анотация для типа, показывает поля для которого можно использовать анотацию
@Retention(RetentionPolicy.RUNTIME)//действует во время работы программы
public @interface AutoInjectable { } 