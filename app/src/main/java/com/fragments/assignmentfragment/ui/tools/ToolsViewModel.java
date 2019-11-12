package com.fragments.assignmentfragment.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToolsViewModel extends ViewModel {
    private  String name;
    private String phoneNo;
    private  int imageId;


    private MutableLiveData<String> mText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public ToolsViewModel(String name, String phoneNo, int imageId) {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
        this.name=name;
        this.phoneNo=phoneNo;
        this.imageId=imageId;
    }

    public LiveData<String> getText() {
        return mText;
    }
}