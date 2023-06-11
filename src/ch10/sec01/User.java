package ch10.sec01;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private int userage;
    private String userEmail;
}
