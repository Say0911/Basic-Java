package ifConditions;

import java.util.Scanner;

/*
Write a program to input the number of units consumed. 
Calculate the Electricity bill according the given rates.
Units consumed        		Rate
less than 100     	 80 paisa/unit
For next 200        		1 Rs/-
For more than 300   		2.50 Rs/-
Print the amount to be paid.*/
public class ElectricalBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int units;
		float amount;
		
		System.out.println("Enter the unit is:");
		units = sc.nextInt();
		
		if(units < 100) {
			amount = units * 0.8f;
		}else if(units >= 100 && units < 200 ) {
			amount = 100*0.8f+(units - 100)* 1;
		}else{
			amount = 100*0.8f+200*1+(units- 300)*2.50f;
		}
		System.out.println("The amount the be pay is: " +amount);
	}

}
