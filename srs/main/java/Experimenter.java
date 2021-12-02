import list.ArrayListManipulator;
import list.LinkedListManipulator;
import printer.Printer;

public class Experimenter 
{
    public void executeExperiment(int listSize) 
    {
        LinkedListManipulator linkedListManipulator = new LinkedListManipulator();
        ArrayListManipulator arrayListManipulator = new ArrayListManipulator(listSize);

        // LinkedList.
        linkedListManipulator.fillLinkedList(listSize);
        Printer.separateLines();

        linkedListManipulator.removeElem(0);
        linkedListManipulator.removeElem(linkedListManipulator.linkedList.size() / 2);
        linkedListManipulator.removeElem(linkedListManipulator.linkedList.size() - 1);
        Printer.separateLines();

        linkedListManipulator.insertElem(0);
        linkedListManipulator.insertElem(linkedListManipulator.linkedList.size() / 2);
        linkedListManipulator.insertElem(linkedListManipulator.linkedList.size() - 1);
        Printer.separateLines();

        linkedListManipulator.getElem(0);
        linkedListManipulator.getElem(linkedListManipulator.linkedList.size() / 2);
        linkedListManipulator.getElem(linkedListManipulator.linkedList.size() - 1);
        Printer.separateLines();

        // ArrayList.
        arrayListManipulator.fillArrayList();
        Printer.separateLines();

        arrayListManipulator.removeElem(0);
        arrayListManipulator.removeElem(arrayListManipulator.arrayList.size() / 2);
        arrayListManipulator.removeElem(arrayListManipulator.arrayList.size() - 1);
        Printer.separateLines();

        arrayListManipulator.insertElem(0);
        arrayListManipulator.insertElem(arrayListManipulator.arrayList.size() / 2);
        arrayListManipulator.insertElem(arrayListManipulator.arrayList.size() - 1);
        Printer.separateLines();

        arrayListManipulator.getElem(0);
        arrayListManipulator.getElem(arrayListManipulator.arrayList.size() / 2);
        arrayListManipulator.getElem(arrayListManipulator.arrayList.size() - 1);
        Printer.separateLines();
    }
}
