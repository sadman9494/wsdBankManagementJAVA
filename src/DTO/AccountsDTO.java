


package DTO;

public class AccountsDTO {

    private  String accountNumber;
    private   double balance;
    private String   userName;

    public AccountsDTO (String  name, double balance , String  accountNumber) {
       
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.userName = name;
    }
    
}
