package com.adityasapplication.app.modules.profile.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityProfileBinding
import com.adityasapplication.app.modules.profile.`data`.model.SpinnerGroupFiftyEightModel
import com.adityasapplication.app.modules.profile.`data`.model.SpinnerGroupFiftyNineModel
import com.adityasapplication.app.modules.profile.`data`.model.SpinnerGroupFiftySevenModel
import com.adityasapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFiftySevenList.value = mutableListOf(
    SpinnerGroupFiftySevenModel("Item1"),
    SpinnerGroupFiftySevenModel("Item2"),
    SpinnerGroupFiftySevenModel("Item3"),
    SpinnerGroupFiftySevenModel("Item4"),
    SpinnerGroupFiftySevenModel("Item5")
    )
    val spinnerGroupFiftySevenAdapter =
    SpinnerGroupFiftySevenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFiftySevenList.value?:
    mutableListOf())
    binding.spinnerGroupFiftySeven.adapter = spinnerGroupFiftySevenAdapter
    viewModel.spinnerGroupFiftyEightList.value = mutableListOf(
    SpinnerGroupFiftyEightModel("Item1"),
    SpinnerGroupFiftyEightModel("Item2"),
    SpinnerGroupFiftyEightModel("Item3"),
    SpinnerGroupFiftyEightModel("Item4"),
    SpinnerGroupFiftyEightModel("Item5")
    )
    val spinnerGroupFiftyEightAdapter =
    SpinnerGroupFiftyEightAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFiftyEightList.value?:
    mutableListOf())
    binding.spinnerGroupFiftyEight.adapter = spinnerGroupFiftyEightAdapter
    viewModel.spinnerGroupFiftyNineList.value = mutableListOf(
    SpinnerGroupFiftyNineModel("Item1"),
    SpinnerGroupFiftyNineModel("Item2"),
    SpinnerGroupFiftyNineModel("Item3"),
    SpinnerGroupFiftyNineModel("Item4"),
    SpinnerGroupFiftyNineModel("Item5")
    )
    val spinnerGroupFiftyNineAdapter =
    SpinnerGroupFiftyNineAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFiftyNineList.value?:
    mutableListOf())
    binding.spinnerGroupFiftyNine.adapter = spinnerGroupFiftyNineAdapter
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"

  }
}
