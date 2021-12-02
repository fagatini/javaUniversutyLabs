package list;

import printer.Printer;
import timer.TaskTimer;

import java.util.LinkedList;
import java.util.List;

public class LinkedListManipulator 
{
    public List<Integer> linkedList;
    private final TaskTimer timer;

    public LinkedListManipulator() 
    {
        this.linkedList = new LinkedList<>();
        this.timer = new TaskTimer();
    }

    public void fillLinkedList(int listCount) 
    {
        var time = timer.calculateExecutionTime(() -> 
        {
            for(int i = 0; i < listCount; i++)
                this.linkedList.add(i);
        });
        Printer.filledArrayMessage(time, listCount, this.linkedList);
    }

    public void removeElem(int index) 
    {
        var time = timer.calculateExecutionTime(() -> 
        {
            this.linkedList.remove(index);
        });
        Printer.removeMessage(time, index, this.linkedList);
    }

    public void insertElem(int index) 
    {
        var time = timer.calculateExecutionTime(() -> 
        {
            this.linkedList.add(index,1);
        });
        Printer.insertMessage(time, index, this.linkedList);
    }

    public void getElem(int index) 
    {
        var time = timer.calculateExecutionTime(() -> 
        {
            var item = this.linkedList.get(index);
        });
        Printer.getMessage(time, index, this.linkedList);
    }
}
