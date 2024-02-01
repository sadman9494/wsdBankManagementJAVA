
package Services;

import DTO.AccountsDTO;
import IServices.IStorage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageService implements IStorage{
  
    public  List<AccountsDTO> accounts = new ArrayList<>();

    @Override
    public void addAccount(AccountsDTO acc) {
       
        accounts.add(acc);
    }

    @Override
    public void getAccountId(String id) {
        
        

        for (AccountsDTO acc : accounts)
        {
            if (acc.getAccountNumber().equals(id))
            {
                System.out.println("Account Details:");
                System.out.println("Account Number: " + acc.getAccountNumber());
                System.out.println("Balance: $" + acc.getBalance());
                System.out.println("User: " + acc.getUserName());
        } else {
            System.out.println("Account not found.");
        }
            
        }

    }

    @Override
    public void getAllAccount() {
       
            if(accounts != null)
            {
                for (AccountsDTO acc : accounts)
                {
                    System.out.println("Account Details:");
                    System.out.println("Account Number: " + acc.getAccountNumber());
                    System.out.println("Balance: $" + acc.getBalance());
                    System.out.println("User: " + acc.getUserName());
                }
            }
            else{System.out.println("Account not found.");}
        } 
        

    @Override
    public void delAccount() {
        
        getAllAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number you want to delete");
        String accountnum = scanner.nextLine();
        for (AccountsDTO acc : accounts)
        {
            if(acc.getAccountNumber().equals(accountnum))
            {
                accounts.remove(acc);
            }
            else {
                System.out.println("Account not found.");
            }
        }
        System.out.println("Your account has been deleted.");
    }

    @Override
    public void updateAccountId(String num) {
        
        for (AccountsDTO acc : accounts)
        {
            if (acc.getAccountNumber().equals(num))
            {
                Scanner scanner = new Scanner(System.in);
          
                System.out.println("Enter your User Name");
                String userName = scanner.nextLine();
      
                
              acc.setUserName(userName);
      
              System.out.println("Account updated successfully!");
        } else {
            System.out.println("Account not found.");
        }
    }
}
    
}
