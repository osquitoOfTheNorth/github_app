package osquitoofthenorth.com.sb_github_app.sb_github_app.fragment

import android.app.Dialog
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import osquitoofthenorth.com.sb_github_app.R
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo
import android.view.Gravity
import osquitoofthenorth.com.sb_github_app.databinding.DetailedRepoInfoLayoutBinding



class RepoInfoDialogFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dialog.window!!.setGravity(Gravity.BOTTOM or Gravity.LEFT)
        val repoInfo = arguments?.getParcelable<RepoInfo>(repoInfoKey)
        val view = DataBindingUtil.inflate<DetailedRepoInfoLayoutBinding>(inflater,R.layout.detailed_repo_info_layout, container,false)
        view.repoInfo = repoInfo
        return view.root
    }


    override fun onStart() {
        super.onStart()
        //Dumb hack to get the dialog fragment to be full width.
        //By default the width is wrap_content
        val width = ViewGroup.LayoutParams.MATCH_PARENT
        val height = ViewGroup.LayoutParams.WRAP_CONTENT
        dialog.window.setLayout(width, height)
    }

    companion object {
        private val repoInfoKey = "REPO_INFO"
        fun getInstance(info : RepoInfo) : RepoInfoDialogFragment{
            val fragment = RepoInfoDialogFragment()
            val args = Bundle()
            args.putParcelable(repoInfoKey, info)
            fragment.arguments = args
            return fragment
        }
    }


}