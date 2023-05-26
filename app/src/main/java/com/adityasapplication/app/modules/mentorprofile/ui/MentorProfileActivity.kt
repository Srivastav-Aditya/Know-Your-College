package com.adityasapplication.app.modules.mentorprofile.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityMentorProfileBinding
import com.adityasapplication.app.modules.mentorprofile.`data`.model.SpinnerGroupFortyFiveModel
import com.adityasapplication.app.modules.mentorprofile.`data`.model.SpinnerGroupFortyFourModel
import com.adityasapplication.app.modules.mentorprofile.`data`.model.SpinnerGroupFortyThreeModel
import com.adityasapplication.app.modules.mentorprofile.`data`.viewmodel.MentorProfileVM
import kotlin.String
import kotlin.Unit

class MentorProfileActivity :
    BaseActivity<ActivityMentorProfileBinding>(R.layout.activity_mentor_profile) {
  private val viewModel: MentorProfileVM by viewModels<MentorProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFortyThreeList.value = mutableListOf(
    SpinnerGroupFortyThreeModel("Item1"),
    SpinnerGroupFortyThreeModel("Item2"),
    SpinnerGroupFortyThreeModel("Item3"),
    SpinnerGroupFortyThreeModel("Item4"),
    SpinnerGroupFortyThreeModel("Item5")
    )
    val spinnerGroupFortyThreeAdapter =
    SpinnerGroupFortyThreeAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFortyThreeList.value?:
    mutableListOf())
    binding.spinnerGroupFortyThree.adapter = spinnerGroupFortyThreeAdapter
    viewModel.spinnerGroupFortyFourList.value = mutableListOf(
    SpinnerGroupFortyFourModel("Item1"),
    SpinnerGroupFortyFourModel("Item2"),
    SpinnerGroupFortyFourModel("Item3"),
    SpinnerGroupFortyFourModel("Item4"),
    SpinnerGroupFortyFourModel("Item5")
    )
    val spinnerGroupFortyFourAdapter =
    SpinnerGroupFortyFourAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFortyFourList.value?:
    mutableListOf())
    binding.spinnerGroupFortyFour.adapter = spinnerGroupFortyFourAdapter
    viewModel.spinnerGroupFortyFiveList.value = mutableListOf(
    SpinnerGroupFortyFiveModel("Item1"),
    SpinnerGroupFortyFiveModel("Item2"),
    SpinnerGroupFortyFiveModel("Item3"),
    SpinnerGroupFortyFiveModel("Item4"),
    SpinnerGroupFortyFiveModel("Item5")
    )
    val spinnerGroupFortyFiveAdapter =
    SpinnerGroupFortyFiveAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFortyFiveList.value?:
    mutableListOf())
    binding.spinnerGroupFortyFive.adapter = spinnerGroupFortyFiveAdapter
    binding.mentorProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENTOR_PROFILE_ACTIVITY"

  }
}
