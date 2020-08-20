package ua.edu.sumdu.ta.practice3;

import ua.edu.sumdu.ta.practice2.Task;

public abstract class AbstractTaskList {

    public abstract void add(Task task);
    public abstract void remove(Task task);
    public abstract int size();
    public abstract Task getTask(int index);
    public abstract Task[] incoming(int from, int to);


}
