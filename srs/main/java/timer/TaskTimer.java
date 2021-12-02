package timer;

public class TaskTimer {
    public long calculateExecutionTime(Callback function) 
    {
        var startTime = System.nanoTime();
        function.call();
        return System.nanoTime() - startTime;
    }
}
