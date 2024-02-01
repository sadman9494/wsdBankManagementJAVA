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
        System.out.println("5. Delete Account");
        System.out.println("6. Update Your information");
        System.out.println("7. Deposit Money");
        System.out.println("8. Withdraw Money");
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

           case 4:
                System.out.println("Exiting the application.");
                System.exit(0);
                break;
            case 5:
            dataStorage.delAccount();
                break;
            case 6:
            System.out.println("Enter account number ");
            String accnum = scanner.nextLine();
            dataStorage.updateAccountId(accnum);
                break;
            case 7:
            System.out.println("Enter the Balance you want to deposite ");
            double balance = scanner.nextDouble();
            System.out.println("Enter account number ");
            String number = scanner.nextLine();

                account.depositeAmount(number,balance);
                break;
            case 8:
            System.out.println("Enter the Balance you want to deposite ");
            double withdrawBalance = scanner.nextDouble();
            System.out.println("Enter account number ");
            String accountNum = scanner.nextLine();
                account.withdrawAmount(accountNum, withdrawBalance);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

   }
}



