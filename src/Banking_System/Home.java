package Banking_System;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===== Simple Banking System =====");
		BankingPage bp = new BankingPage();
		bp.openAccount();
		int sw;
		do {
		System.out.println("1. Display all account details  2. Search by Account number  3. Deposit the amount  4. Withdraw the amount 5.Exit ");
		System.out.println("Choose any one -");
		sw = sc.nextInt();
		switch (sw) {
		case 1:
			System.out.println("Display all account details :");
			bp.showAccount();
			
			break;
		case 2:
			System.out.println(" Search by Account number :");
			 String ac_no = sc.next(); 
			bp.search(ac_no);
           
			break;
		case 3:
			System.out.println("Deposit the amount :");
			bp.deposit();
			
			break;
		case 4:
			System.out.println("Withdraw the amount :");
			bp.withdrawal();
			
			break;
		case 5:  
            System.out.println("See you soon...");  
            break; 
		default:
			System.out.println("Choose Wrong One - ");
		}
	}
		while(sw != 5);

}
}
