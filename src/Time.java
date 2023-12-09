/**
 * The Time class represents a time somewhere in the world. A Time object can be created, time moving can then be
 * simulated and multiple times and be added.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * The constructor of Time creates a new instance of Time given the below parameters
     *
     * @param hours represents the current amount of hours
     * @param minutes represents the current amount of minutes
     * @param seconds represents the current amount of seconds
     */
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * The method reformatTime will check the current values of all three instance variables and adjust
     * them based on their current value compared to their highest allowed value. The corresponding instance
     * variable will be adjusted if needed. For example if seconds is 60, it will be reset to 0 and minutes will
     * increase by 1. If hours is 24 it will be reset to 0.
     */
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
            hours -= 24;
        }
    }

    /**
     * The method tick increases the value of seconds by one and then calls reformatTime
     */
    public void tick(){
        seconds++;
        reformatTime();
    }

    /**
     * The method add takes an instance of Time and calls that instance's toString method in order to gain
     * its values of hours, minutes, and seconds. These values are then added to the instance of Time that
     * is used to call the method. reformatTime is then called.
     *
     * @param time represents the instance of time that is being added
     */
    public void add(Time time){
        String time2 = time.toString();
        hours += Integer.parseInt(time2.substring(0,2));
        minutes += Integer.parseInt(time2.substring(3,5));
        seconds += Integer.parseInt(time2.substring(6,8));
        reformatTime();
    }

    /**
     * The toString method will return a String with the current time, shown through the values of the
     * instance variables
     *
     * @return returns a String that is properly formatted in the conventional method for formatting time
     * in America
     */
    public String toString() {
        String time = "";
        time += (hours < 10) ? "0" + hours + ":" : hours + ":";
        time += (minutes < 10) ? "0" + minutes + ":" : minutes + ":";
        time += (seconds < 10) ? "0" + seconds : seconds;
        return time;
    }
}