
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account firstAccount=new Account ("First account", 100.00);
        System.out.println("First account's balance: ");
        System.out.println(firstAccount);
        firstAccount.deposit(20);
        System.out.println("Balace after deposit: ");
        System.out.println(firstAccount);
    }

}
