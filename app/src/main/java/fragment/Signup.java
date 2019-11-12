package fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.fragments.assignmentfragment.R;

import interfaces.Tablay;
import interfaces.ValidateUser;
import model.RegisterModel;

public class Signup  extends Fragment implements View.OnClickListener {
    private EditText passwords, usernm, conpwd;
    private Button signupBtn;

    public Signup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.signup_main, container, false);
        passwords = view.findViewById(R.id.passwords);
        usernm = view.findViewById(R.id.email);
        conpwd = view.findViewById(R.id.confirm);
        signupBtn = view.findViewById(R.id.signupBtn);
        signupBtn.setOnClickListener(this);

        return (view);
    }

    @Override
    public void onClick(View v) {
        DataSave();

    }

    public void DataSave() {
        String name = "", password = "", repassword = "";
        if (!TextUtils.isEmpty(usernm.getText().toString())) {
            name = usernm.getText().toString();
            if (!TextUtils.isEmpty(passwords.getText().toString())) {
                password = passwords.getText().toString();
                if (!TextUtils.isEmpty(conpwd.getText().toString())) {
                    repassword = conpwd.getText().toString();
                } else {
                    conpwd.setError("enter confirm password");
                    return;
                }
            } else {
                passwords.setError("enter password");
                return;
            }
        } else {
            usernm.setError("enter name");
            return;
        }

        if (password.equals(repassword)) {
            RegisterModel datacenter = new RegisterModel();
            datacenter.setPassword(password);
            datacenter.setUsername(name);
            Tablay impl = new ValidateUser();
            if (impl.adduser(datacenter)) {
                Toast.makeText(getActivity(), "User saved swipe left to login", Toast.LENGTH_LONG).show();
                Clear();
            }

        } else {
            Toast.makeText(getActivity(), "Please enter same password", Toast.LENGTH_SHORT).show();
        }


    }

    public void Clear() {
        usernm.setText("");
        passwords.setText("");
        conpwd.setText("");
    }
}