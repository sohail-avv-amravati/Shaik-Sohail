class Bank_Account{
    String Name;
    int Account_Number;
    double Balance;
    String IFSC;
    String Branch;
    double amount;

Bank_Account(String Name, int Account_Number, double Balance, String IFSC, String Branch){
    this.Name = Name;
    this.Account_Number = Account_Number;
    this.Balance = Balance;
    this.IFSC = IFSC;
    this.Branch = Branch;
}
 void Account_details(){
    System.out.println("Name: "+Name);
    System.out.println("Account Number: "+Account_Number);
    System.out.println("Balance: "+Balance);
 }
 void deposit(double amount){
    Balance += amount;
    System.out.println("Deposit amount: "+amount);
    System.out.println("Updated Balance :"+Balance);
}
void withdraw(double amount){
    if(Balance < amount){
        System.out.println("withwral Amount: "+amount);
        System.out.println("Insufficient Balance");
    }
    else{
        Balance -= amount;
        System.out.println("withwral Amount: "+amount);
        System.out.println("Remaining Balance: "+Balance);
    }
}
public static void main(String[] args){
    Bank_Account b1 = new Bank_Account("Sohail", 1123323123, 10000, "SBIN080796","AMERICA");
    b1.Account_details();
    b1.deposit(10000);
    b1.withdraw(5000);

    Bank_Account b2 = new Bank_Account("praveen", 1121211212,12222,"SBIN123321","Dharavi");
    b2.Account_details();
    b2.deposit(10000);
    b2.withdraw(5000);

}}