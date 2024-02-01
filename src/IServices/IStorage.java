package IServices;
import java.util.List;

import DTO.AccountsDTO;

public interface IStorage {

 public void addAccount(AccountsDTO acc);
 public void getAccountId(String id);
 public void getAllAccount();
 public void delAccount() ;
 public void updateAccountId(String num);

} 