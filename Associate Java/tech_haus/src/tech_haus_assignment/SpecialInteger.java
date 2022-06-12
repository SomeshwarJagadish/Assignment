package tech_haus_assignment;

import java.util.Scanner;

public class SpecialInteger {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the two digit integer");
	int N = scan.nextInt();
	int n1=N%10;
	int n2=N/10;
	int spcl =(n1+n2)+(n1*n2);
	if(N==spcl) {
		System.out.println(N +" is a special Integer");
	}else {
		System.out.println(N + " is not aspecial Integer");
	}
	
}
}
