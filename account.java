package application;

import java.util.Scanner;

import entities.systemBank;
public class Account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int Number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		systemBank bank = new systemBank();
		bank.setName(name);
		bank.setNumber(Number);
	
		
		
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		if ( answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			bank.setValue(sc.nextDouble());
		}
		System.out.println();
		System.out.print("Account data:\n" + bank);
		System.out.println();
		System.out.print("\nEnter a deposit value: ");
		double value = sc.nextDouble();
		bank.depositValue(value);
		System.out.print("Updated account data:\n" + bank);
		System.out.println();
		System.out.print("\nEnter a withdraw value: ");
		value = sc.nextDouble();
		bank.withdrawValue(value);
		System.out.print("Updated account data: " + bank);
		sc.close();
	}

}
