// Generated by Dagger (https://google.github.io/dagger).
package osquitoofthenorth.com.sb_github_app.sb_github_app.di;

import dagger.internal.Preconditions;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Activities.MainActivity;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Activities.MainActivity_MembersInjector;

public final class DaggerAppComponent implements AppComponent {
  private AppModule appModule;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appModule = builder.appModule;
  }

  @Override
  public void inject(MainActivity activity) {
    injectMainActivity(activity);
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectViewModelFactory(
        instance, AppModule_ProvideViewModelFactoryFactory.proxyProvideViewModelFactory(appModule));
    MainActivity_MembersInjector.injectApplicationContext(
        instance, AppModule_ProvideContextFactory.proxyProvideContext(appModule));
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }
  }
}