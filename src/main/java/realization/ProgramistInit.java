package realization;

import interfaces.programist;

public class ProgramistInit implements programist 
{
    @Override
    public void doCalculation() 
    {
        System.out.println("Hey, i am programist");
    }
}
