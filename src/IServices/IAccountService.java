package IServices;

import DTO.*;

public interface IAccountService {
   public void createAccount ();
   public void depositeAmount(String acc, double amount) ;
   public void withdrawAmount(String acc, double amount) ;
} 
    

