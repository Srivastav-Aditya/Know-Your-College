package com.adityasapplication.app.modules.sessiontoconnectwithmentor.ui

import android.view.View
import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivitySessionToConnectWithMentorBinding
import com.adityasapplication.app.modules.sessiontoconnectwithmentor.`data`.model.ListuserRowModel
import com.adityasapplication.app.modules.sessiontoconnectwithmentor.`data`.viewmodel.SessionToConnectWithMentorVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SessionToConnectWithMentorActivity :
    BaseActivity<ActivitySessionToConnectWithMentorBinding>(R.layout.activity_session_to_connect_with_mentor)
    {
  private val viewModel: SessionToConnectWithMentorVM by viewModels<SessionToConnectWithMentorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listuserAdapter = ListuserAdapter(viewModel.listuserList.value?:mutableListOf())
    binding.recyclerListuser.adapter = listuserAdapter
    listuserAdapter.setOnItemClickListener(
    object : ListuserAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListuserRowModel) {
        onClickRecyclerListuser(view, position, item)
      }
    }
    )
    viewModel.listuserList.observe(this) {
      listuserAdapter.updateData(it)
    }
    binding.sessionToConnectWithMentorVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListuser(
    view: View,
    position: Int,
    item: ListuserRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SESSION_TO_CONNECT_WITH_MENTOR_ACTIVITY"

  }
}
