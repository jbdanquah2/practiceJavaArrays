package javatest;
import java.util.*;

public class GetHMS {

	public static void main(String[] args) {
		
		GetHMS getHms = new GetHMS();
		getHms.computeHMS(0);
	}
	
	public int[] computeHMS(int seconds) {
		//seconds = 3735 ;
		int hour = seconds / 3600;;
		int minute = (seconds-(hour*3600)) / 60;
		int sec = seconds-(hour*3600) - (minute* 60);
		int arry[] = new int[3];
		arry[0] = hour;
		arry[1] = minute;
		arry[2] = sec;
		System.out.println( hour +" hour(s) " +  minute +" Minute(s) " + sec +" second(s) " );
		System.out.println(Arrays.toString(arry));
		
		
		return arry;
	}
	
}
