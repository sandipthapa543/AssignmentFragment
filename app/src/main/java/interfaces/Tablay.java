package interfaces;

import model.RegisterModel;

public interface Tablay {
    boolean adduser(RegisterModel dc);

    boolean Checkuser(String name,String password );
}
