package osquitoofthenorth.com.sb_github_app;

import android.arch.core.executor.testing.InstantTaskExecutorRule;
import android.support.annotation.NonNull;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.UserInfo;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Network.GitHubRepo;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Network.GitHubService;
import osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class ViewModelUnitTests {

    @Mock
    GitHubRepo testRepo;

    @Mock
    GitHubService testService;

    Scheduler testScheduler = Schedulers.from(new Executor() {
        @Override
        public void execute(@NonNull Runnable command) {
            command.run();
        }
    });



    @Rule
    public InstantTaskExecutorRule rule = new InstantTaskExecutorRule();

    @Test
    public void viewModelTestHappyPath() {
        when(testService.getReposForUser(any(String.class))).thenReturn(getTestRepoInfo());
        when(testService.searchForUser(any(String.class))).thenReturn(getTestUserInfo());
        when(testRepo.getGithubService()).thenReturn(testService);
        MainActivityViewModel vm = new MainActivityViewModel(testRepo, testScheduler, testScheduler);
        vm.onSearch();
        Assert.assertTrue(vm.getErrorMessage().equals(""));
        Assert.assertTrue(vm.getAvatarImageUrl().getStringValue().equals("https:testurl"));
        Assert.assertTrue(vm.getGithubUserName().getStringValue().equals("test1"));
        Assert.assertTrue(vm.getRepoInfo().containsAll(getList()));

    }


    @Test
    public void viewModelTestErrorScenario() {
        Single<UserInfo> errorUI = Single.error(new Exception(""));
        Single<List<RepoInfo>> errorRepoInfo =  Single.error(new Exception(""));
        when(testService.getReposForUser(any(String.class))).thenReturn(errorRepoInfo);
        when(testService.searchForUser(any(String.class))).thenReturn(errorUI);
        when(testRepo.getGithubService()).thenReturn(testService);
        MainActivityViewModel vm = new MainActivityViewModel(testRepo, testScheduler, testScheduler);
        vm.onSearch();
        Assert.assertTrue(vm.getErrorMessage().equals("Ooops....Sorry, something went wrong."));
        Assert.assertTrue(vm.getAvatarImageUrl().getStringValue().equals(""));
        Assert.assertTrue(vm.getGithubUserName().getStringValue().equals(""));
        Assert.assertNull(vm.getRepoInfo());

    }


    @Test
    public void viewModelTestErrorScenario2() {
        when(testService.getReposForUser(any(String.class))).thenReturn(getTestRepoInfo());
        when(testService.searchForUser(any(String.class))).thenReturn(getTestUserInfoNullable());
        when(testRepo.getGithubService()).thenReturn(testService);
        MainActivityViewModel vm = new MainActivityViewModel(testRepo, testScheduler, testScheduler);
        vm.onSearch();
        Assert.assertTrue(vm.getErrorMessage().equals(""));
        Assert.assertTrue(vm.getAvatarImageUrl().getStringValue().equals(""));
        Assert.assertTrue(vm.getGithubUserName().getStringValue().equals(""));

    }


    private Single<List<RepoInfo>> getTestRepoInfo(){
        List<RepoInfo> arrayList = getList();
        return Single.just(arrayList);
    }

    private List<RepoInfo> getList(){
        List<RepoInfo> arrayList = new ArrayList<>();
        RepoInfo repoInfo1 = new RepoInfo("test1", "test1", "test1", 1,1);
        RepoInfo repoInfo2 = new RepoInfo("test2", "test2", "test2", 2,2);
        arrayList.add(repoInfo1);
        arrayList.add(repoInfo2);
        return arrayList;
    }

    private Single<UserInfo> getTestUserInfo(){
        UserInfo info = new UserInfo("test1", "https:testurl");
        return Single.just(info);
    }

    private Single<UserInfo> getTestUserInfoNullable(){
        UserInfo info = new UserInfo(null, null);
        return Single.just(info);
    }


}
