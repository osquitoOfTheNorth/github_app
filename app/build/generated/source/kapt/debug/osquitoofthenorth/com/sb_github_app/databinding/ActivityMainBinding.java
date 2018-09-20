package osquitoofthenorth.com.sb_github_app.databinding;
import osquitoofthenorth.com.sb_github_app.R;
import osquitoofthenorth.com.sb_github_app.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_container, 5);
        sViewsWithIds.put(R.id.user_info_wrapper, 6);
        sViewsWithIds.put(R.id.repo_info_recycler_view, 7);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    public final android.support.v7.widget.RecyclerView repoInfoRecyclerView;
    @NonNull
    public final android.widget.Button searchButton;
    @NonNull
    public final android.widget.LinearLayout searchContainer;
    @NonNull
    public final android.support.design.widget.TextInputEditText searchInput;
    @NonNull
    public final android.widget.LinearLayout userInfoWrapper;
    // variables
    @Nullable
    private osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener searchInputandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.searchModel.stringValue
            //         is viewModel.searchModel.setStringValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(searchInput);
            // localize variables for thread safety
            // viewModel.searchModel != null
            boolean viewModelSearchModelJavaLangObjectNull = false;
            // viewModel
            osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.searchModel.stringValue
            java.lang.String viewModelSearchModelStringValue = null;
            // viewModel.searchModel
            osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString viewModelSearchModel = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSearchModel = viewModel.getSearchModel();

                viewModelSearchModelJavaLangObjectNull = (viewModelSearchModel) != (null);
                if (viewModelSearchModelJavaLangObjectNull) {




                    viewModelSearchModel.setStringValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.repoInfoRecyclerView = (android.support.v7.widget.RecyclerView) bindings[7];
        this.searchButton = (android.widget.Button) bindings[2];
        this.searchButton.setTag(null);
        this.searchContainer = (android.widget.LinearLayout) bindings[5];
        this.searchInput = (android.support.design.widget.TextInputEditText) bindings[1];
        this.searchInput.setTag(null);
        this.userInfoWrapper = (android.widget.LinearLayout) bindings[6];
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.viewModel == variableId) {
            setViewModel((osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGithubUserName((osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString) object, fieldId);
            case 1 :
                return onChangeViewModelSearchModel((osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString) object, fieldId);
            case 2 :
                return onChangeViewModelAvatarImageUrl((osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGithubUserName(osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString ViewModelGithubUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.stringValue) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSearchModel(osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString ViewModelSearchModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.stringValue) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAvatarImageUrl(osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString ViewModelAvatarImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.stringValue) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
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
        osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString viewModelGithubUserName = null;
        osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString viewModelSearchModel = null;
        java.lang.String viewModelAvatarImageUrlStringValue = null;
        java.lang.String viewModelSearchModelStringValue = null;
        osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString viewModelAvatarImageUrl = null;
        java.lang.String viewModelGithubUserNameStringValue = null;
        osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0x99L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.githubUserName
                        viewModelGithubUserName = viewModel.getGithubUserName();
                    }
                    updateRegistration(0, viewModelGithubUserName);


                    if (viewModelGithubUserName != null) {
                        // read viewModel.githubUserName.stringValue
                        viewModelGithubUserNameStringValue = viewModelGithubUserName.getStringValue();
                    }
            }
            if ((dirtyFlags & 0xaaL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchModel
                        viewModelSearchModel = viewModel.getSearchModel();
                    }
                    updateRegistration(1, viewModelSearchModel);


                    if (viewModelSearchModel != null) {
                        // read viewModel.searchModel.stringValue
                        viewModelSearchModelStringValue = viewModelSearchModel.getStringValue();
                    }
            }
            if ((dirtyFlags & 0xccL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.avatarImageUrl
                        viewModelAvatarImageUrl = viewModel.getAvatarImageUrl();
                    }
                    updateRegistration(2, viewModelAvatarImageUrl);


                    if (viewModelAvatarImageUrl != null) {
                        // read viewModel.avatarImageUrl.stringValue
                        viewModelAvatarImageUrlStringValue = viewModelAvatarImageUrl.getStringValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xccL) != 0) {
            // api target 1

            osquitoofthenorth.com.sb_github_app.sb_github_app.bindingadapters.ImageViewBindingAdapter.setImageViewResource(this.mboundView3, viewModelAvatarImageUrlStringValue);
        }
        if ((dirtyFlags & 0x99L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelGithubUserNameStringValue);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.searchButton.setOnClickListener(mCallback1);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.searchInput, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, searchInputandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xaaL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.searchInput, viewModelSearchModelStringValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        osquitoofthenorth.com.sb_github_app.sb_github_app.viewmodels.MainActivityViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onSearch();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, osquitoofthenorth.com.sb_github_app.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(osquitoofthenorth.com.sb_github_app.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.githubUserName
        flag 1 (0x2L): viewModel.searchModel
        flag 2 (0x3L): viewModel.avatarImageUrl
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): viewModel.githubUserName.stringValue
        flag 5 (0x6L): viewModel.searchModel.stringValue
        flag 6 (0x7L): viewModel.avatarImageUrl.stringValue
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}