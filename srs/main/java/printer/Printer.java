package printer;

import java.util.List;

public class Printer 
{
    private static final String SET_BOLD_TEXT = "\033[0;1m";
    private static final String SET_PLAIN_TEXT = "\033[0;0m";
    private static final String ANSI_CYAN = "\u001b[36m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String REPLACE_STRING = "java.util.";

    private Printer() {}

    public static void separateLines() 
    {
        System.out.println("\n============================================================\n");
    }

    public static void filledArrayMessage(long time, int listSize, List<Integer> list) 
    {
        System.out.println("Spent " + time + " nanos to insert " + listSize + " elements into " + SET_BOLD_TEXT +
                ANSI_CYAN + list.getClass().getName().replace(REPLACE_STRING, "") + SET_PLAIN_TEXT +
                ANSI_RESET);
    }

    public static void removeMessage(long time, int position, List<Integer> list) 
    {
        System.out.println("Spent " + time + " nanos to delete elem at " + position + " index from " + SET_BOLD_TEXT +
                ANSI_CYAN + list.getClass().getName().replace(REPLACE_STRING, "") + SET_PLAIN_TEXT +
                ANSI_RESET + " which has " + list.size() + " elements");
    }

    public static void insertMessage(long time, int position, List<Integer> list) 
    {
        System.out.println("Spent " + time + " nanos to insert elem in " + position + " index to the " + SET_BOLD_TEXT +
                ANSI_CYAN + list.getClass().getName().replace(REPLACE_STRING, "") + SET_PLAIN_TEXT +
                ANSI_RESET + " which has " + list.size() + " elements");
    }

    public static void getMessage(long time, int position, List<Integer> list) 
    {
        System.out.println("Spent " + time + " nanos to get elem at " + position + " index from " + SET_BOLD_TEXT +
                ANSI_CYAN + list.getClass().getName().replace(REPLACE_STRING, "") + SET_PLAIN_TEXT +
                ANSI_RESET + " which has " + list.size() + " elements");
    }
}
