package com.example.clinicadeesteticaniceface.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
 //       mText.setValue("This is home fragment");
        mText.setValue(""); //Tirar a informação do centro da tela
    }

    public LiveData<String> getText() {
        return mText;
    }
}