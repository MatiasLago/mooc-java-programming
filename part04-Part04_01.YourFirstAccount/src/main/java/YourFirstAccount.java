
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
    Account Account1 = new Account("Account1: ", 100.00);

    System.out.println("Initial state");
    System.out.println(Account1);

    Account1.deposit(20);
    
    System.out.println("End state");
    System.out.println(Account1);
    }
}
