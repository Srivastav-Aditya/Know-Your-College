package com.adityasapplication.app.modules.livesession.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.livesession.`data`.model.LiveSessionModel
import org.koin.core.KoinComponent

class LiveSessionVM : ViewModel(), KoinComponent {
  val liveSessionModel: MutableLiveData<LiveSessionModel> = MutableLiveData(LiveSessionModel())

  var navArguments: Bundle? = null
}
