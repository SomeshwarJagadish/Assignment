package tech_haus_assignment;
import java.util.Scanner;
public class LargestNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int n1 = scan.nextInt();
	int n2 = scan.nextInt();
	int max = Integer.max(n1, n2);
	System.out.println("Maximum among two numbers is"+max);
}
}
