package tech_haus_assignment;

import java.util.Scanner;

public class MedianOfArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int N = scan.nextInt();
	double[] elements = new double[N];
	System.out.println("Enter the elements");
	for (int i = 0; i<N; i++) {
		elements[i]=scan.nextDouble(); 
	}
	if(elements.length==1) {
		System.out.println("Median is="+elements[0]);
	}else if(elements.length%2==0) {
		double median = (elements[(elements.length/2)-1]+elements[elements.length/2])/2;
		System.out.println("Median is="+median);
	}else {
		double median = elements[elements.length/2];
		System.out.println("Median is="+median);
	}
}
}
