package osquitoofthenorth.com.sb_github_app.sb_github_app.Models

import com.google.gson.annotations.SerializedName

data class UserInfo(@SerializedName("name")
                    val name : String?,
                    @SerializedName("avatar_url")
                    val avatarUrl : String?)