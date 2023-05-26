package com.adityasapplication.app.modules.whenopenedaparticularcollege.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.whenopenedaparticularcollege.`data`.model.WhenOpenedAParticularCollegeModel
import org.koin.core.KoinComponent

class WhenOpenedAParticularCollegeVM : ViewModel(), KoinComponent {
  val whenOpenedAParticularCollegeModel: MutableLiveData<WhenOpenedAParticularCollegeModel> =
      MutableLiveData(WhenOpenedAParticularCollegeModel())

  var navArguments: Bundle? = null
}
