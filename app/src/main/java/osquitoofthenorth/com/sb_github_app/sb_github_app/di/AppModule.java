package osquitoofthenorth.com.sb_github_app.sb_github_app.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Network.GitHubRepo;
import osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainViewModelFactory;

@Module
public class AppModule{

    private Context context;
    public AppModule(Context context){
        this.context = context;
    }

    @Provides
    Context provideContext(){
        return context;
    }

    @Provides
    GitHubRepo provideGithubRepo(){
        return new GitHubRepo();
    }

    @Provides
    MainViewModelFactory provideViewModelFactory(){
        return new MainViewModelFactory(provideGithubRepo());
    }
}
