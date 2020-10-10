package com.example.clinicadeesteticaniceface.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is gallery fragment");
        mText.setValue(""); //Tirar a informação do centro da tela
    }

    public LiveData<String> getText() {
        return mText;
    }
}