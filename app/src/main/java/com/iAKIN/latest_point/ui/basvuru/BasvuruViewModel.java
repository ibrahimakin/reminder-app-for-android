package com.iAKIN.latest_point.ui.basvuru;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BasvuruViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BasvuruViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is başvuru fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}