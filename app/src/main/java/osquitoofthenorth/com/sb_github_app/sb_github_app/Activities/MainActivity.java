package osquitoofthenorth.com.sb_github_app.sb_github_app.Activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;
import osquitoofthenorth.com.sb_github_app.R;
import osquitoofthenorth.com.sb_github_app.databinding.ActivityMainBinding;
import osquitoofthenorth.com.sb_github_app.sb_github_app.GithubApplication;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo;
import osquitoofthenorth.com.sb_github_app.sb_github_app.adapters.RepoInfoAdapter;
import osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel;
import osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainViewModelFactory;

public class MainActivity extends AppCompatActivity {



    @Inject MainViewModelFactory viewModelFactory;
    @Inject Context applicationContext;
    private MainActivityViewModel viewModel;
    private EditText mEditText;
    private LinearLayout mUserInfoHeader;
    private RecyclerView userInfoRecyclerView;
    private RepoInfoAdapter mRepoInfoAdapter;
    private AnimatorListenerAdapter mAnimationEndListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GithubApplication.getApplicationComponent().inject(this);
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainActivityViewModel.class);

        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mEditText = dataBinding.getRoot().findViewById(R.id.search_input);
        mUserInfoHeader = dataBinding.getRoot().findViewById(R.id.user_info_wrapper);
        userInfoRecyclerView = dataBinding.getRoot().findViewById(R.id.repo_info_recycler_view);
        mRepoInfoAdapter = new RepoInfoAdapter(this, getSupportFragmentManager());
        userInfoRecyclerView.setAdapter(mRepoInfoAdapter);
        userInfoRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        userInfoRecyclerView.setAlpha(0.0f);
        mUserInfoHeader.setAlpha(0.0f);
        mAnimationEndListener = new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                animateView(userInfoRecyclerView, null, -40);
            }
        };

        viewModel.subscribeToErrorEvents().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String errorMessage) {
                Toast.makeText(applicationContext, errorMessage, Toast.LENGTH_SHORT).show();
            }
        });

        viewModel.subscribeToSearchEvents().observe(this, new Observer<Object>() {
            @Override
            public void onChanged(@Nullable Object unit) {
                hideKeyBoard();
            }
        });

        viewModel.subscribeToUserInfoEvents().observe(this, new Observer<Object>() {
            @Override
            public void onChanged(@Nullable Object o) {
                animateView(mUserInfoHeader, mAnimationEndListener, -40);
            }
        });

        viewModel.subscribeToRepoInfo().observe(this, new Observer<List<RepoInfo>>() {
            @Override
            public void onChanged(@Nullable List<RepoInfo> repoInfos) {
                if(mRepoInfoAdapter != null) {
                    mRepoInfoAdapter.updateRepos(repoInfos);
                }
            }
        });

        dataBinding.setViewModel(viewModel);


    }

    private void hideKeyBoard(){
        InputMethodManager in = (InputMethodManager)this.getSystemService(Context.INPUT_METHOD_SERVICE);
        if(in != null) {
            in.hideSoftInputFromWindow(mEditText.getWindowToken(), 0);
        }
    }

    private void animateView(View view, @Nullable AnimatorListenerAdapter animationEndListener, float endingY){
        if(view != null ){
            view.setAlpha(0.0f);
            view.animate()
                    .alpha(1.0f)
                    .setDuration(1000)
                    .translationY(endingY)
                    .setListener(animationEndListener);
        }
    }

}
