package com.adityasapplication.app.modules.qna.ui

import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityQnaBinding
import com.adityasapplication.app.modules.qna.`data`.viewmodel.QnaVM
import kotlin.String
import kotlin.Unit

class QnaActivity : BaseActivity<ActivityQnaBinding>(R.layout.activity_qna) {
  private val viewModel: QnaVM by viewModels<QnaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.qnaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "QNA_ACTIVITY"

  }
}
