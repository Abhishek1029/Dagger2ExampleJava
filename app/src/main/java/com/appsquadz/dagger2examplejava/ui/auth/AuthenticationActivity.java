package com.appsquadz.dagger2examplejava.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.appsquadz.dagger2examplejava.R;
import com.appsquadz.dagger2examplejava.viewmodel.ViewModelProviderFactory;
import com.bumptech.glide.RequestManager;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthenticationActivity extends DaggerAppCompatActivity {
    private static final String TAG = "AuthenticationActivity";
    private AuthenticationViewModel viewModel;
    ImageView imageView;
    @Inject
    RequestManager requestManager;
    @Inject
    Drawable image;
    @Inject
    ViewModelProviderFactory providerFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        imageView = findViewById(R.id.login_logo);
        viewModel = ViewModelProviders.of(this, providerFactory).get(AuthenticationViewModel.class);
        setImage();
    }

    private void setImage() {
        requestManager.load(image)
                .into(imageView);
    }
}