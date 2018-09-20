// Generated by Dagger (https://google.github.io/dagger).
package osquitoofthenorth.com.sb_github_app.sb_github_app.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Network.GitHubRepo;

public final class AppModule_ProvideGithubRepoFactory implements Factory<GitHubRepo> {
  private final AppModule module;

  public AppModule_ProvideGithubRepoFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public GitHubRepo get() {
    return provideInstance(module);
  }

  public static GitHubRepo provideInstance(AppModule module) {
    return proxyProvideGithubRepo(module);
  }

  public static AppModule_ProvideGithubRepoFactory create(AppModule module) {
    return new AppModule_ProvideGithubRepoFactory(module);
  }

  public static GitHubRepo proxyProvideGithubRepo(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideGithubRepo(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
