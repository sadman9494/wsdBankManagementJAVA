
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
    public AccountsDTO delAccount(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'delAccount'");
    }

    @Override
    public AccountsDTO updateAccountId(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateAccountId'");
    }
    
}
