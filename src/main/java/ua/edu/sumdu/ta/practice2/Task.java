package ua.edu.sumdu.ta.practice2;

public class Task {

    private String title;
    private boolean active = false;
    private int time;

    private int startTime;
    private int endTime;
    private int repeatInterval;


    public Task(String title, int time) {
        setTime(time);
        setTitle(title);
        setActive(this.active);
    }

    public Task(String title, int start, int end, int repeat) {
        setTime(start, end, repeat);
        setTitle(title);
        setActive(this.active);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && title != "") this.title = title; // возможно надо ||
        else System.out.println("Введите корректное название");
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
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
        if (repeat >= 0) this.repeatInterval = repeat;
        else System.out.println("Введите корректное число повторений");
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getRepeatInterval() {
        return repeatInterval;
    }

    public boolean isRepeated() {
        return repeatInterval != 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        String result = "";
        if (isActive()) {

            if (repeatInterval == 0) {
                sb.append("Task \"").append(title).append("\" at ").append(time);
            } else if (repeatInterval > 0) {
                sb.append("Task \"").append(title).append("\" from ").append(startTime).append(" to ").append(endTime).append(" every ").append(repeatInterval).append(" seconds");

            }
        } else sb.append("Task \"").append(title).append("\" is inactive");
        result = sb.toString();
        return result;
    }


    public int nextTimeAfter(int time) {

        return -1;

    }

}

