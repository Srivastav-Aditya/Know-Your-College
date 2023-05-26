package com.adityasapplication.app.modules.livesessionloginscreen.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityLiveSessionLoginScreenBinding
import com.adityasapplication.app.modules.livesessionloginscreen.`data`.viewmodel.LiveSessionLoginScreenVM
import kotlin.String
import kotlin.Unit

class LiveSessionLoginScreenActivity :
    BaseActivity<ActivityLiveSessionLoginScreenBinding>(R.layout.activity_live_session_login_screen)
    {
  private val viewModel: LiveSessionLoginScreenVM by viewModels<LiveSessionLoginScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveSessionLoginScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LIVE_SESSION_LOGIN_SCREEN_ACTIVITY"

  }
}
