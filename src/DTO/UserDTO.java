package DTO;

public class UserDTO {

    private  String userName;
    private String passCode;
    private int userId;
    private AccountsDTO  account;

    public UserDTO(String name , String passCode , int id) {
        this.userId = id;
        this.userName = name;
        this.passCode = passCode;

    }
}
