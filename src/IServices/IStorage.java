package IServices;
import DTO.AccountsDTO;

public interface IStorage {

 public AccountsDTO addAccount (AccountsDTO acc);
 public AccountsDTO getAccountId (int id);
 public AccountsDTO getAllAccount ();
 public AccountsDTO delAccount (int id);
 public AccountsDTO updateAccountId (int id);

} 