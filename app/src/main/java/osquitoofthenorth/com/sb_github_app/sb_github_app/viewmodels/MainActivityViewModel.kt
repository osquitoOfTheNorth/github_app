package osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.functions.BiFunction
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.UserInfo
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.UserInfoViewModel
import osquitoofthenorth.com.sb_github_app.sb_github_app.Network.GitHubRepo


class MainActivityViewModel(private val repo : GitHubRepo,
                            private val observableScheduler : Scheduler,
                            private val subscriberScheduler : Scheduler) : ViewModel(){


    private val errorLiveData : MutableLiveData<String> = MutableLiveData()
    open val onSearchEvent : MutableLiveData<Any> = MutableLiveData()
    private val onUserInfoComplete : MutableLiveData<Any> = MutableLiveData()
    private val repoInfoLiveData : MutableLiveData<List<RepoInfo>> = MutableLiveData()

    var errorMessage : String = ""
    var searchModel = ObservableString("")
    var avatarImageUrl  = ObservableString("")
    var githubUserName = ObservableString("")
    var repoInfo : List<RepoInfo>? = null
    fun subscribeToUserInfoEvents() : MutableLiveData<Any> {
        return onUserInfoComplete
    }

    fun subscribeToSearchEvents() : MutableLiveData<Any> {
        return onSearchEvent
    }

    fun subscribeToErrorEvents() : MutableLiveData<String>{
        return errorLiveData
    }

    fun subscribeToRepoInfo() : MutableLiveData<List<RepoInfo>>{
        return repoInfoLiveData
    }

    fun onSearch() {
        onSearchEvent.value = Any()
        val userInfoSource = repo.githubService.searchForUser(searchModel.stringValue)
        val repoInfoSource = repo.githubService.getReposForUser(searchModel.stringValue)
        val compositeData = Single.zip(userInfoSource,repoInfoSource,
                BiFunction{ui : UserInfo, ri : List<RepoInfo> -> UserInfoViewModel(ui, ri)})
        compositeData.subscribeOn(subscriberScheduler).observeOn(observableScheduler)
                .subscribe({ userInfoViewModel : UserInfoViewModel ->
                                 onResponse(userInfoViewModel)},
                           { t : Throwable -> onFailure(t) })

    }

   private fun onFailure(t : Throwable) {
       errorMessage = "Ooops....Sorry, something went wrong."
       errorLiveData.value = errorMessage
    }

    private fun onResponse(userInfoViewModel: UserInfoViewModel) {
        val userInfo = userInfoViewModel.userInfo
        avatarImageUrl.stringValue = userInfo.avatarUrl ?: ""
        githubUserName.stringValue = userInfo.name ?: ""
        repoInfoLiveData.value = userInfoViewModel.repoInfo
        repoInfo = userInfoViewModel.repoInfo
        onUserInfoComplete.value = Any()
    }
}