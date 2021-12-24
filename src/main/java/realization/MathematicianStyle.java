package realization;

import interfaces.mathematician;

public class MathematicianStyle implements mathematician 
{
    @Override
    public void doCalculation() 
    {
        System.out.println("2 + 2 = 4");
    }
}
