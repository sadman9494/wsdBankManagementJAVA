


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
    public  void setAccountNumber(String accountNumber){this.accountNumber=accountNumber;}
    public void setUserName(String userName ) { this.userName = userName;}
    public void setBalance(double  balance) { this.balance = balance ;}

    public String  getAccountNumber() { return accountNumber ;}
    public String getUserName () {return  userName;}
    public double  getBalance(){ return balance ;}
    
}
