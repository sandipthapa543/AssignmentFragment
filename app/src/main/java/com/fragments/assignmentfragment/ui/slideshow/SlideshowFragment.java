package com.fragments.assignmentfragment.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.fragments.assignmentfragment.R;

public class SlideshowFragment extends Fragment implements View.OnClickListener {

    private SlideshowViewModel slideshowViewModel;
    EditText etFirst,etSecond;
    private Button btnCalc;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        //final TextView textView = root.findViewById(R.id.text_slideshow);
        //slideshowViewModel.getText().observe(this, new Observer<String>() {
          //  @Override
            //public void onChanged(@Nullable String s) {
              //  textView.setText(s);
            //}
        //});

        etFirst=root.findViewById(R.id.etFirst);
        etSecond=root.findViewById(R.id.etSecond);
        btnCalc=root.findViewById(R.id.add);
        btnCalc.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        int first= Integer.parseInt(etFirst.getText().toString());
        int second=Integer.parseInt(etSecond.getText().toString());
        int result= first+second;
        Toast.makeText(getActivity(),"Sum is:"+result,Toast.LENGTH_LONG).show();

    }
}