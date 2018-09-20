package osquitoofthenorth.com.sb_github_app.sb_github_app.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import osquitoofthenorth.com.sb_github_app.R

class RepoInfoView(context : Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {


    private var attributes : AttributeSet
    lateinit private var labelTextView : TextView
    lateinit private var valueTextView : TextView

    init{
        attributes = attributeSet
        init()
    }


    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) : this(context, attributeSet){
        attributes = attributeSet
        init()
    }

    private fun init(){
        val array = context.theme.obtainStyledAttributes(attributes, R.styleable.RepoInfoView, 0, 0)
        val labelText = array.getString(R.styleable.RepoInfoView_labelText)
        val valueText = array.getString(R.styleable.RepoInfoView_valueText)
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view =inflater.inflate(R.layout.repo_info_line_item, this, true)
        labelTextView = view.findViewById(R.id.label)
        valueTextView = view.findViewById(R.id.value_for_label)
        labelTextView.text = labelText
        valueTextView.text = valueText
        array.recycle()
    }


    fun setValueText(text : Any){
        valueTextView.text = text.toString()
        invalidate()
    }

    fun setLabelText(text: String){
        labelTextView.text = text
        invalidate()
    }


}