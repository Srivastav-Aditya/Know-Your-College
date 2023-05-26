package com.adityasapplication.app.modules.aboutus.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityAboutUsBinding
import com.adityasapplication.app.modules.aboutus.`data`.viewmodel.AboutUsVM
import kotlin.String
import kotlin.Unit

class AboutUsActivity : BaseActivity<ActivityAboutUsBinding>(R.layout.activity_about_us) {
  private val viewModel: AboutUsVM by viewModels<AboutUsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aboutUsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ABOUT_US_ACTIVITY"

  }
}
