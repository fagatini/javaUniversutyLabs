package realization;

import interfaces.physicist;

public class PhysicistStyle implements physicist 
{
    @Override
    public void doCalculation() 
    {
        System.out.println("P = m + n, where m = n = 2");
    }
}
