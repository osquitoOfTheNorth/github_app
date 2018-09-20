package osquitoofthenorth.com.sb_github_app.sb_github_app;

import android.app.Application;

import osquitoofthenorth.com.sb_github_app.sb_github_app.di.AppComponent;
import osquitoofthenorth.com.sb_github_app.sb_github_app.di.AppModule;
import osquitoofthenorth.com.sb_github_app.sb_github_app.di.DaggerAppComponent;

public class GithubApplication extends Application{

    private static AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }


    public static AppComponent getApplicationComponent(){
        return appComponent;
    }
}
