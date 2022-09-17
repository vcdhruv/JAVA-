class Bank{
    int accountNo;
    String name;
    float amount;
    void insert(int accountNo , String name , float amount){
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount; 
    }
    void deposit(float amt){
        amount = amount + amt;
        System.out.println("money deposited is :" +amt);
    }
    void withdrawal(float amt){
        if(amount < amt){
            System.out.println("Insufficient balance");
        }
        else{
            amount = amount - amt;
            System.out.println("money withdrawed is :" +amt);
        }
    }
    void checkBalance(){
        System.out.println("amount available in " + accountNo + " is :" + amount);
    }
    void display(){
        System.out.println(accountNo + " " + name + " " + amount);
    }

}
public class BankingSystem{
    public static void main(String[] args){
        Bank sc = new Bank();
        sc.insert(111 , "VCD" , 4500);
        sc.display();
        sc.deposit(1000);
        sc.display();
        sc.withdrawal(500);
        sc.display();
        sc.checkBalance();
    }
}