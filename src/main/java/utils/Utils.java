package utils;

public class Utils 
{
    public static final String OPERATORS = "+-*/^()";

    
    /** 
     * @param s строка для проверки на то, число это или нет
     * @return boolean результат проверки на то, число это или нет
     */
    public static boolean isNum(String s) 
    {
        try 
        {
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException ex) 
        {
            return false;
        }
    }

    
    /** 
     * @param s знак операции, которую следует сравнить с списком операций
     * @return boolean результат поиска
     */
    public static boolean isOperator(String s) 
    {
        return OPERATORS.contains(s);
    }
}
