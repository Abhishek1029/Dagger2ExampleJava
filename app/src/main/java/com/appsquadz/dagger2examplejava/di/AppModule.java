package com.appsquadz.dagger2examplejava.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.appsquadz.dagger2examplejava.R;
import com.appsquadz.dagger2examplejava.utils.Constants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {
  /*  @Provides
    static String cricketMatch() {
        return "India vs Newzeland WTC Final";
    }*/

    @Singleton
    @Provides
    static RequestOptions providesRequestOptions() {
        return new RequestOptions()
                .placeholder(R.drawable.wtc_final)
                .error(R.drawable.wtc_final);
    }

    @Singleton
    @Provides
    static RequestManager providesRequestManager(Application application, RequestOptions requestOptions) {
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Singleton
    @Provides
    static Drawable providerDrawable(Application application) {
        return ContextCompat.getDrawable(application, R.drawable.wtc_final);
    }

    @Singleton
    @Provides
    static Retrofit providesRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
