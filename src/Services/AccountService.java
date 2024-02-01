

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
            System.out.println("You must enter atleast 500 tk to open account");
          }
          
        AccountsDTO account = new AccountsDTO(userName, initialBalance,accountNumber);
        dataStorage.addAccount(account);

        System.out.println("Account created successfully!");
    }

    @Override
    public AccountsDTO depositeAccount(AccountsDTO acc, int amount) {
       
        throw new UnsupportedOperationException("Unimplemented method 'depositeAccount'");
    }

    @Override
    public AccountsDTO withdrawAccountDTO(AccountsDTO acc, int amount) {
        
        throw new UnsupportedOperationException("Unimplemented method 'withdrawAccountDTO'");
    }
    
}
