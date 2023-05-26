package com.adityasapplication.app.modules.livesessionloginscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.livesessionloginscreen.`data`.model.LiveSessionLoginScreenModel
import org.koin.core.KoinComponent

class LiveSessionLoginScreenVM : ViewModel(), KoinComponent {
  val liveSessionLoginScreenModel: MutableLiveData<LiveSessionLoginScreenModel> =
      MutableLiveData(LiveSessionLoginScreenModel())

  var navArguments: Bundle? = null
}
