package comm.skilldistillkery.makechange;

import java.util.Scanner;

public class MakeChange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double twenty = 20.0;
	double ten = 10.0;
	double five = 5.0;
	double one = 1.0;
	double quarter = 0.25;
	double dime = 0.1;
	double  nickel = 0.5;
	double penny =  0.01;
	
	double amount = 0.0;
	System.out.println("What is the price of the item  you are  trying to  purchase?: ");
	amount  = sc.nextDouble();
	
	double tendered = 0.0;
	System.out.println("What will you be paying with today?: ");
	tendered = sc.nextDouble();
	
	
	if (amount == tendered) {
		exactAmount();
		
	}
		else if (amount > tendered) {
			notEnough(amount, tendered);
		}
		else if (amount < tendered) {
			tooMuch(amount, tendered);
		}
}

public static void exactAmount() {
	System.out.println("Thank you for providing the exact amount!");
}

public static void notEnough(double amount, double tendered) {
	System.out.println("You have provided less than the total");
	amount = amount - tendered;
	System.out.println("Please pay the remaining " + amount);
}

public static void tooMuch(double amount, double tendered) {
	System.out.println("You have provided more than the total");
	amount = tendered  - amount;
	System.out.println("Your change is " + amount);
}

}
