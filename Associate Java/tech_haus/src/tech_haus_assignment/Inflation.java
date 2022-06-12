package tech_haus_assignment;

import java.util.Scanner;
import java.math.*;

public class Inflation {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Inflation rate(eg: 20 for 20%)");
	double inflation = 1+(scan.nextDouble()/100);
	System.out.println("Enter the number of years");
	int years = scan.nextInt();
	double compoundInt = ((Math.pow(inflation, years))-1)*100;
	System.out.println("Compound inflation for "+years+" years is="+compoundInt);
}
}
