import java.util.Scanner;

abstract class Account{//Base class or parent class
	long accNum;
	String name;
	double amount;
	static String bankName = "ABC Bank"; //Base class variable
	
	Account() {//default constructor
		System.out.println("Account Object constructed");
	}
	
	public void display(){
		System.out.println("Bank Name is : "+bankName);
		}	
	abstract void showDepositDetails();
	//	void showDepositDetails() {
	//	System.out.println("Deposit function available for account at"+bankName);
	//}
	abstract void showWithdrwaDetails();
	//void showWithdrwaDetails() {
	//	System.out.println("Withdraw function available for account"+bankName);
	//}
}

class SBAccount extends Account{//derived/child class
	SBAccount() {
		System.out.println("SBAccount Object constructed");
		System.out.println("Interest to be paid is 4% per month");
	}
	public void display(){
		System.out.println("Savings account has been created in "+bankName);
		}	
	void showDepositDetails() {
		System.out.println("Deposit function available for Savings Account");
	}
	void showWithdrwaDetails() {
		System.out.println("Withdraw function available for Savings account");
	}
}

class CurrentAccount extends Account{
	CurrentAccount() {
		System.out.println("Current Account Object constructed");
	}
	public void display(){
		System.out.println("Current account has been created in "+bankName);
		}	
	void showDepositDetails() {
		System.out.println("Deposit function available for Current account");
	}
	void showWithdrwaDetails() {
		System.out.println("Withdraw function available for Current account");
	}
}
public class ProblemOne {

	public static void main(String[] args) {
		
	//Implement the run-time polymorphism by creating base class variable and derived class object. 
		
	Account a;
			
	//Ask the user for which type of account to be created then create the corresponding account (Note: Use scanner class)
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Select the Account type option to be created: 1. Savings or 2. Current");
	int x = sc.nextInt();
	
	if(x == 1) {
		a = new SBAccount();//Account object will be constructed before SBAccount object
		a.display();
		a.showDepositDetails();
		a.showWithdrwaDetails();
	}else{
		if (x == 2) {
			a = new CurrentAccount();//Account object will be constructed before CurrentAccount object
			a.display();
			a.showDepositDetails();
			a.showWithdrwaDetails();
			
		}else {
			System.out.println("Attention: Choose the correct option");
			}
		}
	}
}