package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest 
{
    @Test
    public void test_simpleExpression() 
    {
        var exp = "41+21";
        assertEquals("41 21 +", Converter.infixToPostfix(exp));
    }

    @Test
    public void test_brackets() 
    {
        var exp1 = "(41+41)";
        var exp2 = "(41^(41+41))+(41*41)";
        assertEquals("41 41 +", Converter.infixToPostfix(exp1));
        assertEquals("41 41 41 + ^ 41 41 * +", Converter.infixToPostfix(exp2));
    }

    @Test
    public void test_precedence() 
    {
        var exp = "41^41+41*41";
        assertEquals("41 41 ^ 41 41 * +", Converter.infixToPostfix(exp));
    }

    @Test
    public void test_complexExpression() 
    {
        var exp = "(21+2^4)*11-(21/7)";
        assertEquals("21 2 4 ^ + 11 * 21 7 / -", Converter.infixToPostfix(exp));
    }
}