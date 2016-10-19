package com.fblogin;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by Ramesh on 10/19/16.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
