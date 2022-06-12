package tech_haus_assignment;

import java.util.Scanner;

public class Time {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of seconds you want to convert to Days,Hours & Minutes");
	double seconds = scan.nextInt();
	int days=0,hours=0,minutes =0;
	days = (int) (seconds/(24*60*60));
	double r = ((seconds/(24*60*60))-days);
	hours = (int) (r*24);
	r=(r*24)-hours;
	minutes = (int) (r*60);
	r=(r*60)-minutes;
	seconds = (int) ((r*60)+1);
	System.out.println(days+" Days " +hours+" Hours "+minutes+" Minutes "+seconds+" Seconds");
}
}
