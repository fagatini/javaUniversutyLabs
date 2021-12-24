package realization;

import interfaces.mathematician;

public class MathematicianInit implements mathematician 
{
    @Override
    public void doCalculation() 
    {
        System.out.println("Hey, i am mathematician");
    }
}
