package ua.edu.sumdu.ta.practice2;

public class Task {

    private String title;
    private boolean active = false;
    private int time ;

    private int startTime = 0;
    private int endTime = 0;
    private int repeatInterval = 0;


    private Task(String title, int time) {
        this.title = title;
        this.time = time;
    }



    private Task(String title, int time, int repeat) {
        this.title = title;
        this.time = time;
        this.repeatInterval = repeat;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setTime(int time) {
        if (time >= 0) this.time = time;
        else System.out.println("Введите корректное время");
    }

    public int getTime() {
        return time;
    }


    public void setTime(int start, int end, int repeat) {
        if (start >= 0) this.startTime = start;
        else System.out.println("Введите корректное время старта");
        if (end >= start) this.endTime = end;
        else System.out.println("Введите корректное время окончания");
        if (repeat > 0) this.repeatInterval = repeat;
        else System.out.println("Введите корректное число повторений");
    }


    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getRepeatInterval() {
        if (repeatInterval > 0)
            return repeatInterval;
        else
            return 0;
    }

}
