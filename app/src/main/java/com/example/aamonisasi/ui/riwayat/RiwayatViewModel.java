package com.example.aamonisasi.ui.riwayat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RiwayatViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RiwayatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Nama Anak");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
