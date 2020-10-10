package com.example.clinicadeesteticaniceface.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is slideshow fragment");
        mText.setValue(""); //Tirar a informação do centro da tela
    }


    public LiveData<String> getText() {
        return mText;
    }
}