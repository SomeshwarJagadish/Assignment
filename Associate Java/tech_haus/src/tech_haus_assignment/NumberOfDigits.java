package tech_haus_assignment;
import java.util.Scanner;
public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		String number = scan.next();
		try {
		int n= Integer.parseInt(number);
		System.out.println("Number of digits in entered number="+number.length());
		} catch (Exception e) {
			System.out.println("Enter only numbers");
		}
		
	}
}
