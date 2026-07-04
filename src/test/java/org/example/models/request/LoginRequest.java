package org.example.models.request;

public class LoginRequest {

    private String username;

    private String password;

    public LoginRequest(String username,String password) {
        this.password = password;
        this.username = username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUserName()
    {
        return username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
