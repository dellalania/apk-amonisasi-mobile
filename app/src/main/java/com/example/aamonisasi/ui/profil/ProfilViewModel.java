package com.example.aamonisasi.ui.profil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfilViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProfilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Profil");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

