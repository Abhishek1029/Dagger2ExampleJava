package com.appsquadz.dagger2examplejava.di;

import androidx.lifecycle.ViewModelProvider;

import com.appsquadz.dagger2examplejava.viewmodel.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {
    @Binds
    public abstract ViewModelProvider.Factory bindsViewModelProviderFactory(ViewModelProviderFactory viewModelProviderFactory);
}
