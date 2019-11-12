package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.fragments.assignmentfragment.NavActivity;
import com.fragments.assignmentfragment.R;

import interfaces.Tablay;
import interfaces.ValidateUser;
import model.RegisterModel;

public class Login extends Fragment implements View.OnClickListener {
    private EditText loginpassword,emailid ;
    private Button loginBtn;

    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.login_main, container, false);
        emailid=view.findViewById(R.id.login_emailid);
        loginpassword=view.findViewById(R.id.login_password);
        loginBtn=view.findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(this);

        return (view);
    }

    @Override
    public void onClick(View v) {
        DataSave();

    }

    public void DataSave(){

        String name = "", password = "";
        if (!TextUtils.isEmpty(emailid.getText().toString())) {
            name = emailid.getText().toString();

            if (!TextUtils.isEmpty(loginpassword.getText().toString())) {
                password = loginpassword.getText().toString();

            } else {
                loginpassword.setError("enter password");
                return;
            }
        } else {
            emailid.setError("enter  name");
            return;
        }
        Tablay  tab = new ValidateUser();
        if (tab.Checkuser(name,password)) {
            Toast.makeText(getActivity(), "Welcome " + name, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), NavActivity.class);
            intent.putExtra("names",name);
            startActivity(intent);
            emailid.setText("");
            loginpassword.setText("");
        }else{
            Toast.makeText(getActivity(), "Login failed please check ! " , Toast.LENGTH_SHORT).show();

        }
    }
}
