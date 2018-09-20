package osquitoofthenorth.com.sb_github_app.sb_github_app.viewholder

import android.support.v4.app.FragmentManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import osquitoofthenorth.com.sb_github_app.R
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo
import osquitoofthenorth.com.sb_github_app.sb_github_app.fragment.RepoInfoDialogFragment

class RepoInfoViewHolder(private val view : View, private val fragmentManager: FragmentManager) : RecyclerView.ViewHolder(view) {

    private val headerTextView : TextView
    private val descriptionTextView : TextView

    init {
        headerTextView = view.findViewById(R.id.repo_name)
        descriptionTextView = view.findViewById(R.id.repo_description)

    }
    fun bindViewHolder(info : RepoInfo){
        headerTextView.text = info.name
        descriptionTextView.text = info.description
        view.setOnClickListener {
            fragmentManager.beginTransaction().add(RepoInfoDialogFragment.getInstance(info), "").commit()
        }
    }

}