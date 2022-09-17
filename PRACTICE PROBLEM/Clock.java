class Time{
int hour;
int min;
int sec;
	public Time(int hour,int min,int sec){
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	public void add(Time t2){
		this.sec = this.sec + t2.sec;
		while(this.sec >= 60){
			this.min++;
			this.sec = this.sec - 60;
		}
		this.min = this.min + t2.min; 
		while(this.min >= 60){
			this.hour++;
			this.min = this.min - 60;
		}

		this.hour = this.hour + t2.hour;
	}
}
public class Clock{
	public static void main(String[] args){
		/*int hour = Integer.parseInt(args[0]);
		int min = Integer.parseInt(args[1]);
		int sec = Integer.parseInt(args[2]);*/
		Time t1 = new Time(0,0,0);
		Time t2 = new Time(1,20,60);
		t1.add(t2);
		System.out.print("hour: " +t1.hour+ " min: " +t1.min+ " sec: " +t1.sec);
	}
}