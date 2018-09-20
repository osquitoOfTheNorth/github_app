package osquitoofthenorth.com.sb_github_app.sb_github_app.Network
import io.reactivex.Single
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.UserInfo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {

    @GET("users/{userid}")
    fun searchForUser(@Path("userid") userId : String) : Single<UserInfo>

    @GET("users/{userid}/repos")
    fun getReposForUser(@Path("userid") userId: String) : Single<List<RepoInfo>>
}