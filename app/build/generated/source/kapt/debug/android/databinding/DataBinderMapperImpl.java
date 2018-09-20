
package android.databinding;
import osquitoofthenorth.com.sb_github_app.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case osquitoofthenorth.com.sb_github_app.R.layout.activity_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_main_0".equals(tag)) {
                            return new osquitoofthenorth.com.sb_github_app.databinding.ActivityMainBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                }
                case osquitoofthenorth.com.sb_github_app.R.layout.detailed_repo_info_layout:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/detailed_repo_info_layout_0".equals(tag)) {
                            return new osquitoofthenorth.com.sb_github_app.databinding.DetailedRepoInfoLayoutBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for detailed_repo_info_layout is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return osquitoofthenorth.com.sb_github_app.R.layout.activity_main;
                }
                break;
            }
            case -2021295799: {
                if(tag.equals("layout/detailed_repo_info_layout_0")) {
                    return osquitoofthenorth.com.sb_github_app.R.layout.detailed_repo_info_layout;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"repoInfo"
            ,"stringValue"
            ,"viewModel"};
    }
}