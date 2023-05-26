package com.adityasapplication.app.modules.whenopenedaparticularcollege.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityWhenOpenedAParticularCollegeBinding
import com.adityasapplication.app.modules.whenopenedaparticularcollege.`data`.viewmodel.WhenOpenedAParticularCollegeVM
import kotlin.String
import kotlin.Unit

class WhenOpenedAParticularCollegeActivity :
    BaseActivity<ActivityWhenOpenedAParticularCollegeBinding>(R.layout.activity_when_opened_a_particular_college)
    {
  private val viewModel: WhenOpenedAParticularCollegeVM by
      viewModels<WhenOpenedAParticularCollegeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.whenOpenedAParticularCollegeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WHEN_OPENED_A_PARTICULAR_COLLEGE_ACTIVITY"

  }
}
