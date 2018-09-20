package osquitoofthenorth.com.sb_github_app.sb_github_app.adapters

import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import osquitoofthenorth.com.sb_github_app.R
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo
import osquitoofthenorth.com.sb_github_app.sb_github_app.viewholder.RepoInfoViewHolder

class RepoInfoAdapter(private val context: Context, private val fragmentManager: FragmentManager) : RecyclerView.Adapter<RepoInfoViewHolder>() {

    private var repos : List<RepoInfo> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoInfoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.repo_info_layout, parent, false)
        return RepoInfoViewHolder(view, fragmentManager)
    }

    override fun getItemCount(): Int {
        return repos.size
    }

    override fun onBindViewHolder(holder: RepoInfoViewHolder, position: Int) {
        val repoItem = repos[position]
        holder.bindViewHolder(repoItem)

    }

    fun updateRepos(newRepos : List<RepoInfo>){
        repos = newRepos
        notifyDataSetChanged()
    }
}