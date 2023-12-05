
public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10, 14, 43);
        Time time2 = new Time(8, 30, 29);
        Time time3 = new Time(7, 20, 0);

        time1.add(time2);
        System.out.println(time1);

        time1.add(time3);
        System.out.println(time1);
    }
}