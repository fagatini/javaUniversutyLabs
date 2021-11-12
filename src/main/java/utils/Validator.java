package utils;

public class Validator 
{
    
    /** 
     * @param expression строка записанного выражения
     * @return boolean результат проверки на то, в правильной ли форме запись
     */
    public static boolean isValid(String expression) 
    {
        return withoutInvalidSymbols(expression) && validExpression(expression);
    }

    
    /** 
     * @param expression строка записанного выражения
     * @return boolean результат проверки на не подходяште символы
     */
    private static boolean withoutInvalidSymbols(String expression) 
    {
        for (String token : expression.split("")) 
        {
            if (!Utils.isOperator(token) && !Utils.isNum(token))
                return false;
        }
        return true;
    }

    
    /** 
     * @param expression строка записанного выражения
     * @return boolean результат проверки на правильную запись, те скобки и количества элементов
     */
    private static boolean validExpression(String expression) 
    {
        return validBrackets(expression) && validOtherOperators(expression);
    }

    
    /** 
     * @param expression строка записанного выражения
     * @return boolean результат проверки на количество операций и операндов
     */
    private static boolean validOtherOperators(String expression) 
    {
        var operatorsCount = 0;
        var operandsCount = 0;
        var newOperand = true;
        var exp = expression.replace("(", "").replace(")", "");
        for (String token : exp.split("")) 
        {
            if (Utils.isOperator(token)) 
            {
                operatorsCount++;
                newOperand = true;
            } else 
            {
                if (newOperand) 
                {
                    operandsCount++;
                    newOperand = false;
                }
            }
        }
        return operatorsCount == --operandsCount;
    }

    
    /** 
     * @param expression строка записанного выражения
     * @return boolean результат проверки на правильность раставления скобок
     */
    private static boolean validBrackets(String expression) 
    {
        var leftBracketsCount = 0;
        var rightBracketsCount = 0;
        for (String token : expression.split("")) 
        {
            if (token.equals("("))
                leftBracketsCount++;
            else if(token.equals(")"))
                rightBracketsCount++;
        }
        return leftBracketsCount == rightBracketsCount;
    }
}
