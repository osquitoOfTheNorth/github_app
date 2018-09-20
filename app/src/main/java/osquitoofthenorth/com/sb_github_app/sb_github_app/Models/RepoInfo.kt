package osquitoofthenorth.com.sb_github_app.sb_github_app.Models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.text.ParseException
import java.text.SimpleDateFormat

data class RepoInfo(@SerializedName("name") val name : String?,
                    @SerializedName("description") val description : String?,
                    @SerializedName("updated_at") val lastUpdated : String?,
                    @SerializedName("stargazers_count") val stars : Int,
                    @SerializedName("forks") val forks : Int) : Parcelable {


    fun formattedLastUpdated() : String{
        val sourceDateFormatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
        val destinationDateFormat = SimpleDateFormat("MMM d, yyyy HH:mm:ss aaa")
        try {
            return destinationDateFormat.format(sourceDateFormatter.parse(lastUpdated))
        } catch (exception : ParseException){
            return ""
        }
    }

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt())

    companion object CREATOR : Parcelable.Creator<RepoInfo> {
        override fun createFromParcel(parcel: Parcel): RepoInfo {
            return RepoInfo(parcel)
        }

        override fun newArray(size: Int): Array<RepoInfo?> {
            return arrayOfNulls(size)
        }
    }

    override fun writeToParcel(parcel: Parcel?, p1: Int) {
        parcel?.writeString(name)
        parcel?.writeString(description)
        parcel?.writeString(lastUpdated)
        parcel?.writeInt(stars)
        parcel?.writeInt(forks)

    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}