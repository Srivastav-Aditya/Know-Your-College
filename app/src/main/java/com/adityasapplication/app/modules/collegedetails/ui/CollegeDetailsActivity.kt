package com.adityasapplication.app.modules.collegedetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityCollegeDetailsBinding
import com.adityasapplication.app.modules.collegedetails.`data`.model.ListtitleofblogRowModel
import com.adityasapplication.app.modules.collegedetails.`data`.viewmodel.CollegeDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CollegeDetailsActivity :
    BaseActivity<ActivityCollegeDetailsBinding>(R.layout.activity_college_details) {
  private val viewModel: CollegeDetailsVM by viewModels<CollegeDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtitleofblogAdapter =
    ListtitleofblogAdapter(viewModel.listtitleofblogList.value?:mutableListOf())
    binding.recyclerListtitleofblog.adapter = listtitleofblogAdapter
    listtitleofblogAdapter.setOnItemClickListener(
    object : ListtitleofblogAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtitleofblogRowModel) {
        onClickRecyclerListtitleofblog(view, position, item)
      }
    }
    )
    viewModel.listtitleofblogList.observe(this) {
      listtitleofblogAdapter.updateData(it)
    }
    binding.collegeDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListtitleofblog(
    view: View,
    position: Int,
    item: ListtitleofblogRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COLLEGE_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CollegeDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
