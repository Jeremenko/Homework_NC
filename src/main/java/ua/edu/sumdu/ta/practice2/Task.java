package ua.edu.sumdu.ta.practice2;

public class Task {

    private String title;
    private boolean active = false;

    private int time;
    private int repeat;
    private int startTime;
    private int endTime;
    private int repeatInterval;

    private Task(String title, int time){
        this.title=title;
        this.time=time;
    };
    private Task(String title, int time, int repeat){
        this.title=title;
        this.time=time;
        this.repeat=repeat;
    };

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    public int getRepeat() {
        return repeat;
    }
}
