package com.adityasapplication.app.modules.collegepredictor.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityCollegePredictorBinding
import com.adityasapplication.app.modules.collegepredictor.`data`.model.SpinnerGroupSeventyFiveModel
import com.adityasapplication.app.modules.collegepredictor.`data`.viewmodel.CollegePredictorVM
import kotlin.String
import kotlin.Unit

class CollegePredictorActivity :
    BaseActivity<ActivityCollegePredictorBinding>(R.layout.activity_college_predictor) {
  private val viewModel: CollegePredictorVM by viewModels<CollegePredictorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupSeventyFiveList.value = mutableListOf(
    SpinnerGroupSeventyFiveModel("Item1"),
    SpinnerGroupSeventyFiveModel("Item2"),
    SpinnerGroupSeventyFiveModel("Item3"),
    SpinnerGroupSeventyFiveModel("Item4"),
    SpinnerGroupSeventyFiveModel("Item5")
    )
    val spinnerGroupSeventyFiveAdapter =
    SpinnerGroupSeventyFiveAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupSeventyFiveList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyFive.adapter = spinnerGroupSeventyFiveAdapter
    binding.collegePredictorVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COLLEGE_PREDICTOR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CollegePredictorActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
