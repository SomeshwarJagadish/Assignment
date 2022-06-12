package tech_haus_assignment;
import java.util.Scanner;
public class SuperMarket {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Net Price of Product");
	double netPrice = scan.nextDouble();
	System.out.println("Enter the Tax Rate of Product");
	double taxRate = scan.nextDouble();
	System.out.println("Gross Price="+(netPrice/(taxRate+1)));
}
}
