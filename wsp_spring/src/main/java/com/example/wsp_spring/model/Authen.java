package com.example.wsp_spring.model;

public class Authen {
    private String user_id,passphrase,userName,userRole;
    public Authen(){
     //   this.passphrase=passphrase;
     //   this.user_id=user_id;
     //   this.userName=userName;
     //   this.userRole=userRole;
    }
    public void setUser_id(String user_id){this.user_id=user_id;}
    public void setPassphrase(String passphrase){this.passphrase=passphrase;}
    public void setUserName(String userName){this.userName=userName;}
    public void setUserRole(String userRole){this.userRole=userRole;}

    public String getUser_id(){return user_id;}
    public String getPassphrase(){return passphrase;}
    public String getUserName(){return userName;}
    public String getUserRole(){return userRole;}
}
