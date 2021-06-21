package com.appsquadz.dagger2examplejava.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.appsquadz.dagger2examplejava.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthenticationViewModel extends ViewModel {
    private static final String TAG = "AuthenticationViewModel";
    private final AuthApi authApi;

    @Inject
    public AuthenticationViewModel(AuthApi authApi) {
        this.authApi = authApi;

        if (this.authApi == null) {
            Log.e(TAG, "AuthenticationViewModel: " + "AUth api is null");
        } else {
            Log.e(TAG, "AuthenticationViewModel: " + "AUth api is not null");
        }
    }
}
