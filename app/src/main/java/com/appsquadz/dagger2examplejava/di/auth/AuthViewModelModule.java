package com.appsquadz.dagger2examplejava.di.auth;

import android.view.View;

import androidx.lifecycle.ViewModel;

import com.appsquadz.dagger2examplejava.di.ViewModelKey;
import com.appsquadz.dagger2examplejava.ui.auth.AuthenticationViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthenticationViewModel.class)
    public abstract ViewModel bindsAuthViewModel(AuthenticationViewModel authenticationViewModel);
}
