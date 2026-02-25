package Module_3;

class BankAccount{
    private int accountNumber;
    private double balance;
    BankAccount(int a,double b){
        accountNumber=a;
        balance=b;
    }
    void deposit(double amt){
        balance+=amt;
    }
    void withdraw(double amt){
        balance-=amt;
    }
    void display(){
        System.out.println(accountNumber+" "+balance);
    }
}
class Program12{
    public static void main(String[] args){
        BankAccount b=new BankAccount(101,5000);
        b.deposit(1000);
        b.withdraw(500);
        b.display();
    }
}