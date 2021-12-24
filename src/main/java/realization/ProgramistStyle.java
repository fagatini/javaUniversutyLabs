package realization;

import interfaces.programist;

public class ProgramistStyle implements programist 
{
    @Override
    public void doCalculation() 
    {
        System.out.println("int Four = 2 + 2;");
    }
}
