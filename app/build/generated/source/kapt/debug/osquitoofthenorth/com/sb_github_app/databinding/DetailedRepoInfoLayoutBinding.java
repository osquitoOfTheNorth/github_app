package osquitoofthenorth.com.sb_github_app.databinding;
import osquitoofthenorth.com.sb_github_app.R;
import osquitoofthenorth.com.sb_github_app.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DetailedRepoInfoLayoutBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final osquitoofthenorth.com.sb_github_app.sb_github_app.views.RepoInfoView firstLine;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final osquitoofthenorth.com.sb_github_app.sb_github_app.views.RepoInfoView secondLine;
    @NonNull
    public final osquitoofthenorth.com.sb_github_app.sb_github_app.views.RepoInfoView thirdLine;
    // variables
    @Nullable
    private osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo mRepoInfo;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DetailedRepoInfoLayoutBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.firstLine = (osquitoofthenorth.com.sb_github_app.sb_github_app.views.RepoInfoView) bindings[1];
        this.firstLine.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.secondLine = (osquitoofthenorth.com.sb_github_app.sb_github_app.views.RepoInfoView) bindings[3];
        this.secondLine.setTag(null);
        this.thirdLine = (osquitoofthenorth.com.sb_github_app.sb_github_app.views.RepoInfoView) bindings[2];
        this.thirdLine.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.repoInfo == variableId) {
            setRepoInfo((osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRepoInfo(@Nullable osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo RepoInfo) {
        this.mRepoInfo = RepoInfo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.repoInfo);
        super.requestRebind();
    }
    @Nullable
    public osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo getRepoInfo() {
        return mRepoInfo;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int repoInfoStars = 0;
        osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo repoInfo = mRepoInfo;
        int repoInfoForks = 0;
        java.lang.String repoInfoFormattedLastUpdated = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (repoInfo != null) {
                    // read repoInfo.stars
                    repoInfoStars = repoInfo.getStars();
                    // read repoInfo.forks
                    repoInfoForks = repoInfo.getForks();
                    // read repoInfo.formattedLastUpdated()
                    repoInfoFormattedLastUpdated = repoInfo.formattedLastUpdated();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.firstLine.setValueText(repoInfoFormattedLastUpdated);
            this.secondLine.setValueText(repoInfoForks);
            this.thirdLine.setValueText(repoInfoStars);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static DetailedRepoInfoLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DetailedRepoInfoLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DetailedRepoInfoLayoutBinding>inflate(inflater, osquitoofthenorth.com.sb_github_app.R.layout.detailed_repo_info_layout, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static DetailedRepoInfoLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DetailedRepoInfoLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(osquitoofthenorth.com.sb_github_app.R.layout.detailed_repo_info_layout, null, false), bindingComponent);
    }
    @NonNull
    public static DetailedRepoInfoLayoutBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DetailedRepoInfoLayoutBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/detailed_repo_info_layout_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DetailedRepoInfoLayoutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): repoInfo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}