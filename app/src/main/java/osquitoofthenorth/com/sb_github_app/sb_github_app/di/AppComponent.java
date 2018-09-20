package osquitoofthenorth.com.sb_github_app.sb_github_app.di;


import dagger.Component;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Activities.MainActivity;

@Component(modules = AppModule.class)
public interface AppComponent {
     void inject(MainActivity activity);
}
