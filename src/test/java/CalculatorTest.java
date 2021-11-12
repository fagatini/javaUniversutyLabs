import domain.Calculator;
import org.junit.Before;
import org.junit.Test;
import service.RPN;

import static org.junit.Assert.*;

public class CalculatorTest 
{
    private Calculator calculator;

    @Before
    public void setUp() 
    {
        this.calculator = new RPN();
    }

    @Test
    public void test_simpleExpression() 
    {
        String res = calculator.calculate("32*2");
        assertEquals("64.0", res);
    }

    @Test
    public void test_complexExpression() 
    {
        String res = calculator.calculate("(21-14+2^(4*(5-2)))*11-(21/7)");
        assertEquals("45130.0", res);
    }

    @Test
    public void test_divisionZeroByZero() 
    {
        String res = calculator.calculate("0/0");
        assertEquals("NaN", res);
    }

    @Test
    public void test_divisionByZero() 
    {
        String res = calculator.calculate("1/0");
        assertEquals("Infinity", res);
    }

    @Test
    public void test_wrongCharInput() 
    {
        var msg = "";
        try 
        {
            calculator.calculate("d*0");
        }catch (ArithmeticException ex)
        {
            msg = ex.getMessage();
        }
        assertEquals("Invalid input.", msg);
    }

    @Test
    public void test_invalidExpression1() 
    {
        var msg = "";
        try 
        {
            calculator.calculate("2+2+");
        }catch (ArithmeticException ex) 
        {
            msg = ex.getMessage();
        }
        assertEquals("Invalid input.", msg);
    }

    @Test
    public void test_invalidExpression3() 
    {
        var msg = "";
        try 
        {
            calculator.calculate("+2+2");
        }catch (ArithmeticException ex) 
        {
            msg = ex.getMessage();
        }
        assertEquals("Invalid input.", msg);
    }

    @Test
    public void test_invalidExpression2() 
    {
        var msg = "";
        try 
        {
            calculator.calculate("((2+2)");
        }catch (ArithmeticException ex) 
        {
            msg = ex.getMessage();
        }
        assertEquals("Invalid input.", msg);
    }


}