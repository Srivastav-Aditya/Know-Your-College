package com.adityasapplication.app.modules.mentorsignup.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityMentorSignupBinding
import com.adityasapplication.app.modules.mentorsignup.`data`.model.SpinnerGroupTwentyOneModel
import com.adityasapplication.app.modules.mentorsignup.`data`.model.SpinnerGroupTwentyTwoModel
import com.adityasapplication.app.modules.mentorsignup.`data`.viewmodel.MentorSignupVM
import kotlin.String
import kotlin.Unit

class MentorSignupActivity :
    BaseActivity<ActivityMentorSignupBinding>(R.layout.activity_mentor_signup) {
  private val viewModel: MentorSignupVM by viewModels<MentorSignupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupTwentyOneList.value = mutableListOf(
    SpinnerGroupTwentyOneModel("Item1"),
    SpinnerGroupTwentyOneModel("Item2"),
    SpinnerGroupTwentyOneModel("Item3"),
    SpinnerGroupTwentyOneModel("Item4"),
    SpinnerGroupTwentyOneModel("Item5")
    )
    val spinnerGroupTwentyOneAdapter =
    SpinnerGroupTwentyOneAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupTwentyOneList.value?:
    mutableListOf())
    binding.spinnerGroupTwentyOne.adapter = spinnerGroupTwentyOneAdapter
    viewModel.spinnerGroupTwentyTwoList.value = mutableListOf(
    SpinnerGroupTwentyTwoModel("Item1"),
    SpinnerGroupTwentyTwoModel("Item2"),
    SpinnerGroupTwentyTwoModel("Item3"),
    SpinnerGroupTwentyTwoModel("Item4"),
    SpinnerGroupTwentyTwoModel("Item5")
    )
    val spinnerGroupTwentyTwoAdapter =
    SpinnerGroupTwentyTwoAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupTwentyTwoList.value?:
    mutableListOf())
    binding.spinnerGroupTwentyTwo.adapter = spinnerGroupTwentyTwoAdapter
    binding.mentorSignupVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENTOR_SIGNUP_ACTIVITY"

  }
}
