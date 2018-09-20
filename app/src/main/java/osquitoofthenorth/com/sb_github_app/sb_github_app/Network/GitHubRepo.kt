package osquitoofthenorth.com.sb_github_app.sb_github_app.Network

import osquitoofthenorth.com.sb_github_app.sb_github_app.Constants
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

open class GitHubRepo {
    @Inject constructor()
    open var githubService : GitHubService
    init {
        val retroFit = Retrofit.Builder()
                .baseUrl(Constants.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        githubService = retroFit.create(GitHubService::class.java)
    }


}