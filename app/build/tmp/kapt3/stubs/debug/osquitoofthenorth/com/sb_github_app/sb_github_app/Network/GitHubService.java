package osquitoofthenorth.com.sb_github_app.sb_github_app.Network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\n"}, d2 = {"Losquitoofthenorth/com/sb_github_app/sb_github_app/Network/GitHubService;", "", "getReposForUser", "Lio/reactivex/Single;", "", "Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/RepoInfo;", "userId", "", "searchForUser", "Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/UserInfo;", "app_debug"})
public abstract interface GitHubService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{userid}")
    public abstract io.reactivex.Single<osquitoofthenorth.com.sb_github_app.sb_github_app.Models.UserInfo> searchForUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userid")
    java.lang.String userId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{userid}/repos")
    public abstract io.reactivex.Single<java.util.List<osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo>> getReposForUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userid")
    java.lang.String userId);
}