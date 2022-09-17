class Time{
    int hour;
    int minute;
    public Time(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
    }
    public void add(Time t){
        this.minute += t.minute;
        if(this.minute>=60){
            this.hour++;
            this.minute-=60;
        }
        this.hour+=t.hour;
    }
}
public class Alarm{
    public static void main(String[] args) {
        Time t1 = new Time(1,60);
        Time t2 = new Time(0,1);
        t1.add(t2);
        System.out.println("hour"+":"+t1.hour+""+"minute"+":"+t1.minute);
    }
}