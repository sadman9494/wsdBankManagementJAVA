


package DTO;

public class AccountsDTO {

    private  String accountNumber;
    private   double balance;
    private String accountId;
    private UserDTO  user;

    public AccountsDTO (String  accountNumber,double balance,String accountId){
       
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountId=accountId;
    }
    
}
