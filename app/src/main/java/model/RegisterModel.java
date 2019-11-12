package model;

public class RegisterModel {
    String username;
    String password;
    String loguser;

    public RegisterModel() {
        this.username = username;
        this.password = password;
        this.loguser=loguser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getLoguser() {
        return loguser;
    }

    public void setLoguser(String loguser) {
        this.loguser = loguser;
    }
}
