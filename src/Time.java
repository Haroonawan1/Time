public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void reformatTime(){
        if (seconds > 59){
            seconds -= 60;
            minutes++;
        }
        if (minutes > 59){
            minutes -= 60;
            hours++;
        }
        if (hours > 23){
            hours -= 23;
        }
    }

    public void tick(){
        seconds++;
        reformatTime();
    }

    public void add(Time time){
        String time2 = time.toString();
        hours += Integer.parseInt(time2.substring(0,2));
        minutes += Integer.parseInt(time2.substring(3,5));
        seconds += Integer.parseInt(time2.substring(6,8));
        reformatTime();
    }

    public String toString() {
        String time = "";
        time += (hours < 10) ? "0" + hours + ":" : hours + ":";
        time += (minutes < 10) ? "0" + minutes + ":" : minutes + ":";
        time += (seconds < 10) ? "0" + seconds : seconds;
        return time;
    }
}