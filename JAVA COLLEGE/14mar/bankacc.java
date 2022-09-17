import java.util.*;
class Bank_Account
{
	int AccountNo;
	String UserName;
	String Email;
	String AccountType;
	int AccountBalance;

	void getAccountDetails()
	{
	 	Scanner sc=new Scanner (System.in);
	 	System.out.println("Enter Account No.");
	 	AccountNo=sc.nextInt();
	 	System.out.println("Enter User Name");
	 	UserName=sc.next();
	 	System.out.println("Enter Email");
	 	Email=sc.next();
	 	System.out.println("Enter Account Type");
	 	AccountType=sc.next();
	 	System.out.println("Enter Account Balance");
	 	AccountBalance=sc.nextInt();

	}

	void displayAccountDetails()
	{
		System.out.println("Account No. "+AccountNo);
		System.out.println("User Name "+UserName);
		System.out.println("Email Id "+Email);
		System.out.println("Account Type "+AccountType);
		System.out.println("Account Balance "+AccountBalance);
	}
}
class BankDetail
{
	public static void main(String[] args) 
	{
		Bank_Account ba=new Bank_Account();
		ba.getAccountDetails();
		ba.displayAccountDetails();
	}
}