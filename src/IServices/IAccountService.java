package IServices;

import DTO.*;

public interface IAccountService {
   public void createAccount ();
    public AccountsDTO depositeAccount (AccountsDTO acc , int amount);
    public AccountsDTO withdrawAccountDTO (AccountsDTO acc , int amount);
} 
    

