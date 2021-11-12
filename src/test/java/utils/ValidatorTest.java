package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest 
{
    @Test
    public void test_simpleValidExpression() 
    {
        var expression = "1*1";
        assertTrue(Validator.isValid(expression));
    }

    @Test
    public void test_complexValidExpression() 
    {
        var expression = "(21-14+2^(4*(5-2)))*11-(21/7)";
        assertTrue(Validator.isValid(expression));
    }

    @Test
    public void test_invalidBrackets() 
    {
        var expression = "(((((21-14+2^(4*(5-2)))*11-(21/7)";
        assertFalse(Validator.isValid(expression));
    }

    @Test
    public void test_invalidCharacters() 
    {
        var expression = "a+1";
        assertFalse(Validator.isValid(expression));
    }

    @Test
    public void test_FirstInvalidOperation() 
    {
        var expression = "(1++1)*1";
        assertFalse(Validator.isValid(expression));
    }

    @Test
    public void test_SecondInvalidOperation() 
    {
        var expression = "(1+1)*1*";
        assertFalse(Validator.isValid(expression));
    }

    @Test
    public void test_ThirdInvalidOperation() 
    {
        var expression = "(1+1-)*1";
        assertFalse(Validator.isValid(expression));
    }

}