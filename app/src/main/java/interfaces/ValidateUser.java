package interfaces;


import model.RegisterModel;

public class  ValidateUser implements Tablay {
     String username, password;

    @Override
    public boolean adduser(RegisterModel rm) {
        boolean b;
        if ((!rm.getPassword().isEmpty()) && (!rm.getUsername().isEmpty())) {
            username = rm.getUsername();
            password = rm.getPassword();
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    @Override
    public boolean Checkuser(String username, String password) {
        boolean b = false;
        try{  if (username.equals(username)&&(password.equals(password))) {
            b = true;
        } else {
            b = false;
        }}catch (Exception ex){
            ex.printStackTrace();
        }
        return b;
    }
}
