package com.fragments.assignmentfragment.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fragments.assignmentfragment.R;

import java.util.ArrayList;
import java.util.List;

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;
    private RecyclerView recyclerView;
    String name;
    String phoneN0;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_tools, container, false);
        //final TextView textView = root.findViewById(R.id.text_tools);
        //toolsViewModel.getText().observe(this, new Observer<String>() {
           // @Override
           // public void onChanged(@Nullable String s) {
              //  textView.setText(s);
            //}
        //});

        recyclerView=root.findViewById(R.id.recyclerView);

        List<ToolsViewModel> contactsList=new ArrayList<>();
        contactsList.add(new ToolsViewModel (name="Dahayang",phoneN0="9803543625",R.drawable.dahayang));
        contactsList.add(new ToolsViewModel (name="Bhuwan",phoneN0="980354363444",R.drawable.bhuwan));
        contactsList.add(new ToolsViewModel (name="Saugat",phoneN0="980354362455",R.drawable.saugat));

        ContactsAdapter contactsAdapter=new ContactsAdapter(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return root;
    }
}