package osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0002J\u0006\u00100\u001a\u00020*J\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u000fJ\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fJ\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Losquitoofthenorth/com/sb_github_app/sb_github_app/viewmodels/MainActivityViewModel;", "Landroid/arch/lifecycle/ViewModel;", "repo", "Losquitoofthenorth/com/sb_github_app/sb_github_app/Network/GitHubRepo;", "observableScheduler", "Lio/reactivex/Scheduler;", "subscriberScheduler", "(Losquitoofthenorth/com/sb_github_app/sb_github_app/Network/GitHubRepo;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "avatarImageUrl", "Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/ObservableString;", "getAvatarImageUrl", "()Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/ObservableString;", "setAvatarImageUrl", "(Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/ObservableString;)V", "errorLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "", "errorMessage", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "githubUserName", "getGithubUserName", "setGithubUserName", "onSearchEvent", "", "getOnSearchEvent", "()Landroid/arch/lifecycle/MutableLiveData;", "onUserInfoComplete", "repoInfo", "", "Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/RepoInfo;", "getRepoInfo", "()Ljava/util/List;", "setRepoInfo", "(Ljava/util/List;)V", "repoInfoLiveData", "searchModel", "getSearchModel", "setSearchModel", "onFailure", "", "t", "", "onResponse", "userInfoViewModel", "Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/UserInfoViewModel;", "onSearch", "subscribeToErrorEvents", "subscribeToRepoInfo", "subscribeToSearchEvents", "subscribeToUserInfoEvents", "app_debug"})
public final class MainActivityViewModel extends android.arch.lifecycle.ViewModel {
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Object> onSearchEvent = null;
    private final android.arch.lifecycle.MutableLiveData<java.lang.Object> onUserInfoComplete = null;
    private final android.arch.lifecycle.MutableLiveData<java.util.List<osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo>> repoInfoLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String errorMessage;
    @org.jetbrains.annotations.NotNull()
    private osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString searchModel;
    @org.jetbrains.annotations.NotNull()
    private osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString avatarImageUrl;
    @org.jetbrains.annotations.NotNull()
    private osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString githubUserName;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo> repoInfo;
    private final osquitoofthenorth.com.sb_github_app.sb_github_app.Network.GitHubRepo repo = null;
    private final io.reactivex.Scheduler observableScheduler = null;
    private final io.reactivex.Scheduler subscriberScheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.MutableLiveData<java.lang.Object> getOnSearchEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString getSearchModel() {
        return null;
    }
    
    public final void setSearchModel(@org.jetbrains.annotations.NotNull()
    osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString getAvatarImageUrl() {
        return null;
    }
    
    public final void setAvatarImageUrl(@org.jetbrains.annotations.NotNull()
    osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString getGithubUserName() {
        return null;
    }
    
    public final void setGithubUserName(@org.jetbrains.annotations.NotNull()
    osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo> getRepoInfo() {
        return null;
    }
    
    public final void setRepoInfo(@org.jetbrains.annotations.Nullable()
    java.util.List<osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Object> subscribeToUserInfoEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Object> subscribeToSearchEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> subscribeToErrorEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo>> subscribeToRepoInfo() {
        return null;
    }
    
    public final void onSearch() {
    }
    
    private final void onFailure(java.lang.Throwable t) {
    }
    
    private final void onResponse(osquitoofthenorth.com.sb_github_app.sb_github_app.Models.UserInfoViewModel userInfoViewModel) {
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    osquitoofthenorth.com.sb_github_app.sb_github_app.Network.GitHubRepo repo, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler observableScheduler, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler subscriberScheduler) {
        super();
    }
}