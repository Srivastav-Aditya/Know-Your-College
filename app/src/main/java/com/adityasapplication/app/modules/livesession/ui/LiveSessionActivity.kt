package com.adityasapplication.app.modules.livesession.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityLiveSessionBinding
import com.adityasapplication.app.modules.livesession.`data`.viewmodel.LiveSessionVM
import kotlin.String
import kotlin.Unit

class LiveSessionActivity : BaseActivity<ActivityLiveSessionBinding>(R.layout.activity_live_session)
    {
  private val viewModel: LiveSessionVM by viewModels<LiveSessionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveSessionVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LIVE_SESSION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveSessionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
