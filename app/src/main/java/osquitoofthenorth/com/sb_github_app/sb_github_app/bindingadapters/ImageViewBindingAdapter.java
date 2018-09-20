package osquitoofthenorth.com.sb_github_app.sb_github_app.bindingadapters;

import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageViewBindingAdapter {

    @BindingAdapter({"bind:imgUrl"})
    public static void setImageViewResource(ImageView imgView, String url){
        if(!TextUtils.isEmpty(url)) {
            Picasso.get().load(url).into(imgView);
        }
    }
}
