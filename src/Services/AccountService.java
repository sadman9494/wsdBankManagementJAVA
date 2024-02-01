

package Services;

import DTO.AccountsDTO;
import DTO.UserDTO;
import IServices.IAccountService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountService implements  IAccountService {
    StorageService dataStorage = new StorageService();

    public AccountService (StorageService dataStorage){ this.dataStorage = dataStorage;}

    @Override
    public void createAccount ()
    {
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("Enter your User Name");
          String userName = scanner.nextLine();

          System.out.println("Enter your AccountNumber");
          String accountNumber = scanner.nextLine();
          
          System.out.println("Enter your initial balance to open an account");
          double initialBalance  = scanner.nextDouble();
          if (initialBalance <= 500) {
            System.out.println("You must enter atleast 500 tk to open account or update the account");
          }
        else {
          AccountsDTO account = new AccountsDTO(userName, initialBalance,accountNumber);
          dataStorage.addAccount(account);
  
          System.out.println("Account created or updated successfully!");
        }  
        
    }

    @Override
    public void depositeAmount(String accNum, double amount) {
     
        for (AccountsDTO acc : dataStorage.accounts)
        {
            if (acc.getAccountNumber().equals(accNum))
            {
                Scanner scanner = new Scanner(System.in);
               double currentBalance = acc.getBalance();
               acc.setBalance(currentBalance + amount);
      
              System.out.println("AMOUNT deposited successfully!");
            } else {
            System.out.println("Account not found.");
          }
        }
    }

    @Override
    public void withdrawAmount(String accNum, double amount) {
        
        for (AccountsDTO acc : dataStorage.accounts)
        {
            if (acc.getAccountNumber().equals(accNum))
            {
                Scanner scanner = new Scanner(System.in);
               double currentBalance = acc.getBalance();
               if (currentBalance - amount < 500)
               {
                System.out.println("You must need to have  atleast 500 tk after withdrawing  your money.");
               }else{
                acc.setBalance(currentBalance - amount);
                System.out.println("You have succcessfully withdrawn  " + amount +" Tk");  
               }
               
            } else {
            System.out.println("Account not found.");
          }
        }
    }
    
}
