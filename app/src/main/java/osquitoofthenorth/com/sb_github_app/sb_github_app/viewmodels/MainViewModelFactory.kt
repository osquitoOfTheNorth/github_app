package osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import osquitoofthenorth.com.sb_github_app.sb_github_app.Network.GitHubRepo

class MainViewModelFactory(private val repo : GitHubRepo) :  ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainActivityViewModel(repo, AndroidSchedulers.mainThread(), Schedulers.io()) as T
    }
}