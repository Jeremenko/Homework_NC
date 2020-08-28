package ua.edu.sumdu.ta.practice3;

import ua.edu.sumdu.ta.practice2.Task;

public class ArrayTaskList extends AbstractTaskList {
    public static String addToTitle = "[EDUCTR][TA]";
    private int size = 0;
    private int sizeOfList = 2;
    private Task[] taskList = new Task[sizeOfList];

    @Override
    public void add(Task task) {
        if (size == sizeOfList - 1) {
            sizeOfList = sizeOfList * 2;
            recreateArray();
        }
        if (task != null) {
            taskList[size] = task;
            size++;
        }
    }

    @Override
    public void remove(Task task) {
        if (task != null) {
            for (int i = 0; i < size; i++) {
                if (taskList[i].equals(task)) {
                    taskList[i] = null;
                    size--;
                }
            }
        }
        recreateArray();

    }

    private void recreateArray() {
        Task[] tempList = new Task[sizeOfList];
        int j = 0;
        for (Task newTask : taskList)
            if (newTask != null) {
                tempList[j++] = newTask;
            }

        taskList = tempList;

    }

    public int size() {
        return this.size;
    }

    public Task getTask(int index) {
        if (index >= 0 && index <= size()) return taskList[index];
        else return null;
    }

    public Task[] incoming(int from, int to) {
        int k = 0;
        Task[] tempTasklist = new Task[size];
        for (Task task : taskList) {
            if (task != null && task.nextTimeAfter(from) >= 0 && task.nextTimeAfter(from) < to) {
                tempTasklist[k++] = task;
            }
        }

        Task[] tempList = new Task[k];
        int j = 0;
        for (Task task : tempTasklist) {
            if (task != null) {
                tempList[j++] = task;
            }
        }
        tempTasklist = tempList;
        return tempTasklist;
    }
}
