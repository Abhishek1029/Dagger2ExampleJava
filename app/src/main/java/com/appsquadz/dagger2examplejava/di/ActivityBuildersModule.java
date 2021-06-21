package com.appsquadz.dagger2examplejava.di;

import com.appsquadz.dagger2examplejava.di.auth.AuthModule;
import com.appsquadz.dagger2examplejava.di.auth.AuthViewModelModule;
import com.appsquadz.dagger2examplejava.ui.auth.AuthenticationActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {
            AuthViewModelModule.class,
            AuthModule.class
    })
    abstract AuthenticationActivity authActivity();

}
