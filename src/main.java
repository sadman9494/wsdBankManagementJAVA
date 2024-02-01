import DTO.*;
import Services.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
    StorageService dataStorage = new StorageService();
    AccountService account = new AccountService(dataStorage);

    Scanner scanner = new Scanner(System.in);
    
    while (true) {
        System.out.println("Menu:");
        System.out.println("1. Create Account");
        System.out.println("2. Show Account Details");
        System.out.println("3. Show All Accounts");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        switch (choice) {
            case 1:
               account.createAccount();
                break;
            case 2:
            System.out.println("Enter account number ");
            String num = scanner.nextLine();
            dataStorage.getAccountId(num);
                break;
           case 3:
            dataStorage.getAllAccount();
                break;
             /* case 4:
                System.out.println("Exiting the application.");
                System.exit(0);
                break;*/
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

   }
}



