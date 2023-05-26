package com.adityasapplication.app.modules.menunotlogin.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityMenuNotLogInBinding
import com.adityasapplication.app.modules.menunotlogin.`data`.viewmodel.MenuNotLogInVM
import kotlin.String
import kotlin.Unit

class MenuNotLogInActivity :
    BaseActivity<ActivityMenuNotLogInBinding>(R.layout.activity_menu_not_log_in) {
  private val viewModel: MenuNotLogInVM by viewModels<MenuNotLogInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuNotLogInVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_NOT_LOG_IN_ACTIVITY"

  }
}
