package calander;

import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println("current date is :");
		int dd=c.get(Calendar.DATE);
		int mm=c.get(Calendar.MONTH);
		int yy=c.get(Calendar.YEAR);
		System.out.println(dd+"-"+mm+"-"+yy);
		
		System.out.println("current time is ");
		int h=c.get(Calendar.HOUR);
		int m=c.get(Calendar.MINUTE);
		int s=c.get(Calendar.SECOND);
		System.out.println(h+"Hour "+m+"Minutes "+s+"Seconds");
		
		int x=c.get(Calendar.AM_PM);
		if(x==0){
			System.out.println("good-morning");
		}
		else{
			System.out.println("good-evening");
		}
	}

}
