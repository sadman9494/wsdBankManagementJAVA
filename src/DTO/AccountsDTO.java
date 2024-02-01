


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

    public String  getAccountNumber() { return accountNumber ;}
    public String getUserName () {return  userName;}
    public double  getBalance(){ return balance ;}
    
}
