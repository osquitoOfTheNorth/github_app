package osquitoofthenorth.com.sb_github_app.sb_github_app.Models

import android.databinding.BaseObservable
import android.databinding.Bindable

data class ObservableString(private var _stringValue : String): BaseObservable(){

    var stringValue : String
        @Bindable get() = _stringValue
        set(value) {
            _stringValue = value
            notifyChange()
        }
}