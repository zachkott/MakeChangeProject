package comm.skilldistillkery.makechange;



import java.util.Scanner;

public class MakeChange {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// These  are the variables being used
		double twenty = 0;
		double ten = 0;
		double five = 0;
		double one = 0;
		double quarter = 0;
		double dime = 0;
		double nickel = 0;
		double penny = 0;

		
//This prompts the user to enter the price of the item
		System.out.println("What is the price of the item  you are  trying to  purchase?: ");
		double amount = 0.0;
		amount = sc.nextDouble();
//This prompts the user to  enter the amount  they will be paying
		System.out.println("What will you be paying with today?: ");
		double tendered = 0.0;
		tendered = sc.nextDouble();

		double changeDue = tendered - amount;

		int exactChange = 0;
		
 // This method is called when the amount tendered equals the amount of the item
		if (changeDue == 0) {
			exactAmount();

		}

		else if (changeDue < 0) {
			notEnough(amount, tendered);
		}

		else if (changeDue > 0) {
			//I used  stringformat to round the double to 2 decimal places
			System.out.println("Your change is:  " + String.format("%.2f", changeDue));
			
			
			changeDue  = changeDue * 100;
			
			//I was having an issue where the amount would display as a long decimal and then proceed to round down, so I used Math Round to make sure it was rounding to the correct number
			changeDue = Math.round(changeDue);
			exactChange = (int) changeDue;
			
			twenty = exactChange / 2000;
			exactChange = exactChange % 2000;
			
			ten = exactChange / 1000;
			exactChange = exactChange % 1000;
			
			five = exactChange / 500;
			exactChange = exactChange % 500;
			
			one = exactChange / 100;
			exactChange = exactChange % 100;
			
			quarter = exactChange / 25;
			exactChange = exactChange % 25;
			
			dime = exactChange / 10;
			exactChange = exactChange % 10;
			
			nickel = exactChange / 5;
			exactChange = exactChange % 5;
			
			penny = exactChange;
			
			System.out.println("Your change is: ");
			
			//Here I made 3 separate arguments for each bill to determine how many of each bill the user will get back
			if (twenty > 1) {
				System.out.println(twenty + " twenty dollar bills " + " ");
			} else if (twenty == 1) {
				System.out.println(twenty + " twenty dollar bill "  + " ");
			} else if (twenty == 0) {
				
			}
			
			
			if (ten > 1) {
				System.out.println(ten + " ten dollar bills " + " ");
			}else if (ten == 1) {
				System.out.println(ten + " ten dollar bill"  + " ");
			} else if (ten == 0) {
				
			}
			
			
			if (five > 1) {
				System.out.println(five + " five dollar bills  " + " ");
			} else if (five == 1) {
				System.out.println(five + " five dollar bill"  + " ");
			} else if (five == 0) {
				
			}
			
			
			if (one > 1) {
				System.out.println(one + " one dollar bills " + " ");
			} else if (one == 1) {
				System.out.println(one + " one dollar bill "  + " ");
			} else if (one == 0) {
				
			}
			
			
			if (quarter > 1) {
				System.out.println(quarter + " quarters " + " ");
			} else  if (quarter == 1) {
				System.out.println(quarter + " quarter "  + " ");
			} else if (quarter == 0)  {
				
			}
			
			
			if (dime > 1) {
				System.out.println(dime + " dimes " + " ");
			} else if (dime == 1) {
				System.out.println(dime + " dime "  + " ");
			} else if (dime == 0) {
				
			}
			
			
			if (nickel > 1) {
				System.out.println(nickel + " nickels " + " ");
			} else if  (nickel == 1) {
				System.out.println(nickel + " nickel "  + " ");
			} else if(nickel ==  0) {
				
			}
			
			
			if (penny > 1) {
				System.out.println(penny + " pennies " + " ");
			} else if (penny == 1) {
				System.out.println(penny + " penny "  + " ");
			} else if (penny == 0) {
				
			}
			
sc.close();
		}


	}
//This method will be called if the user pays the exact amount
	public static void exactAmount() {
		System.out.println("Thank you for providing the exact amount!");
	}

	//This method will be called if the user pays less than the price of the item
	public static void notEnough(double amount, double tendered) {
		System.out.println("You have provided less than the total");
		amount = amount - tendered;
		System.out.println("Please pay the remaining: $" + String.format("%.2f", amount));
	}

	


}
