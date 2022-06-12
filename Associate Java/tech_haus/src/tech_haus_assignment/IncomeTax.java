package tech_haus_assignment;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Taxable Income");
		double income = scan.nextDouble();
		if(income<=250000) {
			System.out.println("Income tax="+0);
		}else if(income>250000&&income<=500000){
			double incomeTax = (income-250000)*0.1;
			System.out.println("Income tax="+incomeTax);
		}else if(income>500000&&income<=1000000){
			double incomeTax =((500000-250000)*0.1)+((income-500000)*0.2);
			System.out.println("Income tax="+incomeTax);
		}else if(income>1000000){
			double incomeTax =((500000-250000)*0.1)+((1000000-500000)*0.2)+((income-1000000)*0.3);
			System.out.println("Income tax="+incomeTax);
		}
	}
	
}
