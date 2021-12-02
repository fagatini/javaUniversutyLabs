import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Scanner;


import printer.Printer;


public class Main 
{
    public static void main(String[] args) 
    {
        var in = new Scanner(System.in);
        System.out.println("Input number of experiments:");
        var count = 0;

        try 
        {
            count = in.nextInt();
        } catch (InputMismatchException ex) 
        {
            System.out.println("Invalid input.");
        }

        if (count > 0) 
        {
            var allOperations = new ArrayDeque<Integer>();
            int i = 0;
            while (i < count) 
            {
                System.out.println("Input number of elements for " + (i + 1) + " experiment.");
                var input = 0L;

                try 
                {
                    input = in.nextLong();
                    if (input > 500_000)
                        System.out.println("Too many elements. Input other value.");
                    else 
                    {
                        allOperations.add(Math.toIntExact(input));
                        ++i;
                    }
                } catch (InputMismatchException ex) 
                {
                    System.out.println("Invalid input.");
                }
            }

            Printer.separateLines();
            var experimenter = new Experimenter();
            for (i = 0; i < count; i++) 
            {
                experimenter.executeExperiment(allOperations.pop());
            }
        }
    }
}