package realization;

import interfaces.physicist;

public class PhysicistInit implements physicist 
{
    @Override
    public void doCalculation() 
    {
        System.out.println("Hey, i am physicist");
    }
}
