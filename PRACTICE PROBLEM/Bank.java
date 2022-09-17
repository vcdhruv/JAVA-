import java.util.Scanner;
class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;

	public Bank_Account(int accountNo , String userName , String email , String accountType , double accountBalance)
	{
		this.accountNo = accountNo;
		this.userName = userName;
		this.email = email;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public String getAccountDetails(){
		return accountNo + ":" + userName + ":" + email + ":" + accountType + ":" + accountBalance + ":";
	}
	public void displayAccountDetails(){
		System.out.print("username: " +userName+ "email: " +email+ "accountType: " +accountType+ "accountBalance: " +accountBalance);
	}
}
public class Bank{
	public static void main(String[] args){
		Bank_Account b = new Bank_Account(101,"vishmay dhruv","vcdhruv777@gmail.com","savings",321456.784);
		b.getAccountDetails();
		b.displayAccountDetails();
	}
}