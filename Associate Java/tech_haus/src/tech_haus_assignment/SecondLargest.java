package tech_haus_assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class SecondLargest {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of elements you want to insert");
	int N = scan.nextInt();
	Integer[] n = new Integer[N];
	System.out.println("Enter the numbers");
	for (int i = 0; i <n.length ; i++) {
		n[i]=scan.nextInt();
	}
	List<Integer> list = Arrays.asList(n);
	TreeSet<Integer> set = new TreeSet<Integer>();
	set.addAll(list);
	System.out.println("Second largest number from given elemnts is " +set.lower(set.last()));
	
}
}
