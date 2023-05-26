package com.adityasapplication.app.modules.collegepredictor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.collegepredictor.`data`.model.CollegePredictorModel
import com.adityasapplication.app.modules.collegepredictor.`data`.model.SpinnerGroupSeventyFiveModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CollegePredictorVM : ViewModel(), KoinComponent {
  val collegePredictorModel: MutableLiveData<CollegePredictorModel> =
      MutableLiveData(CollegePredictorModel())

  var navArguments: Bundle? = null

  val spinnerGroupSeventyFiveList: MutableLiveData<MutableList<SpinnerGroupSeventyFiveModel>> =
      MutableLiveData()
}
