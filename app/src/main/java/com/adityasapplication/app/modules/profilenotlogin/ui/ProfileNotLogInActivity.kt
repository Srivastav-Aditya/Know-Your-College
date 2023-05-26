package com.adityasapplication.app.modules.profilenotlogin.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityProfileNotLogInBinding
import com.adityasapplication.app.modules.profilenotlogin.`data`.viewmodel.ProfileNotLogInVM
import kotlin.String
import kotlin.Unit

class ProfileNotLogInActivity :
    BaseActivity<ActivityProfileNotLogInBinding>(R.layout.activity_profile_not_log_in) {
  private val viewModel: ProfileNotLogInVM by viewModels<ProfileNotLogInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileNotLogInVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_NOT_LOG_IN_ACTIVITY"

  }
}
