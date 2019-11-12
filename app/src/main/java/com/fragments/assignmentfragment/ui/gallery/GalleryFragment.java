package com.fragments.assignmentfragment.ui.gallery;

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

public class GalleryFragment extends Fragment implements View.OnClickListener {

    private GalleryViewModel galleryViewModel;
    EditText First;
    Button circle;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_circle, container, false);
       // final TextView textView = root.findViewById(R.id.text_gallery);
       // galleryViewModel.getText().observe(this, new Observer<String>() {
          //  @Override
          //  public void onChanged(@Nullable String s) {
              //  textView.setText(s);
           // }
       // });

        First=root.findViewById(R.id.First);
        circle=root.findViewById(R.id.circle);
        circle.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        int first= Integer.parseInt(First.getText().toString());
        double result= first*first*3.42;
        Toast.makeText(getActivity(),"Radius is :"+result,Toast.LENGTH_LONG).show();


    }
}