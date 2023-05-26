package com.adityasapplication.app.modules.sessiontoconnectwithmentor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.sessiontoconnectwithmentor.`data`.model.ListuserRowModel
import com.adityasapplication.app.modules.sessiontoconnectwithmentor.`data`.model.SessionToConnectWithMentorModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SessionToConnectWithMentorVM : ViewModel(), KoinComponent {
  val sessionToConnectWithMentorModel: MutableLiveData<SessionToConnectWithMentorModel> =
      MutableLiveData(SessionToConnectWithMentorModel())

  var navArguments: Bundle? = null

  val listuserList: MutableLiveData<MutableList<ListuserRowModel>> =
      MutableLiveData(mutableListOf())
}
