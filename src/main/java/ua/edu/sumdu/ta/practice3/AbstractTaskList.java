package ua.edu.sumdu.ta.practice3;

import ua.edu.sumdu.ta.practice2.Task;

public abstract class AbstractTaskList {
    abstract void add(Task task);

    abstract void remove(Task task);

    abstract int size();

    abstract Task getTask(int index);

    abstract Task[] incoming(int from, int to);


}
