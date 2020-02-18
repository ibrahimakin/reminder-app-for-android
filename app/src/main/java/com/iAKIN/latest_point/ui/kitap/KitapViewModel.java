package com.iAKIN.latest_point.ui.kitap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KitapViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KitapViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is kitap fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}