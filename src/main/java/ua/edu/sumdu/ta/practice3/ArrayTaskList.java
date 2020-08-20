package ua.edu.sumdu.ta.practice3;

import ua.edu.sumdu.ta.practice2.Task;

public class ArrayTaskList extends AbstractTaskList {
    public static String addToTitle = "[EDUCTR][TA]";
    private int size = 0;
    private int actualListOfTasks = 0;
    private int numberOfTasks = 0;
    Task[] taskList = new Task[numberOfTasks]; // надо разобраться какой тут массив правильно создать

    @Override
    public void add(Task task) {
        if (task != null) {

        }

    }

    public void remove(Task task) {
        if (task != null) {

        }
    }

    public int size() {
        return this.size;
    }


    public Task getTask(int index) {
        if (index >= 0 && index <= size()) return taskList[index];
        else return null;

    }

    public ArrayTaskList() {
        this.actualListOfTasks++;

    }

    public Task[] incoming(int from, int to) {
 /*       if(from < to && from >=0 && to >=1){

        }
  */
    }

}
