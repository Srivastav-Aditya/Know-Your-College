package com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityCollegeDetailsAfterCollegePredictorBinding
import com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.`data`.model.ListnameofcollegeRowModel
import com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.`data`.viewmodel.CollegeDetailsAfterCollegePredictorVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CollegeDetailsAfterCollegePredictorActivity :
    BaseActivity<ActivityCollegeDetailsAfterCollegePredictorBinding>(R.layout.activity_college_details_after_college_predictor)
    {
  private val viewModel: CollegeDetailsAfterCollegePredictorVM by
      viewModels<CollegeDetailsAfterCollegePredictorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnameofcollegeAdapter =
    ListnameofcollegeAdapter(viewModel.listnameofcollegeList.value?:mutableListOf())
    binding.recyclerListnameofcollege.adapter = listnameofcollegeAdapter
    listnameofcollegeAdapter.setOnItemClickListener(
    object : ListnameofcollegeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnameofcollegeRowModel) {
        onClickRecyclerListnameofcollege(view, position, item)
      }
    }
    )
    viewModel.listnameofcollegeList.observe(this) {
      listnameofcollegeAdapter.updateData(it)
    }
    binding.collegeDetailsAfterCollegePredictorVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListnameofcollege(
    view: View,
    position: Int,
    item: ListnameofcollegeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COLLEGE_DETAILS_AFTER_COLLEGE_PREDICTOR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CollegeDetailsAfterCollegePredictorActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
