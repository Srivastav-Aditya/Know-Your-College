package com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.`data`.model.CollegeDetailsAfterCollegePredictorModel
import com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.`data`.model.ListnameofcollegeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CollegeDetailsAfterCollegePredictorVM : ViewModel(), KoinComponent {
  val collegeDetailsAfterCollegePredictorModel:
      MutableLiveData<CollegeDetailsAfterCollegePredictorModel> =
      MutableLiveData(CollegeDetailsAfterCollegePredictorModel())

  var navArguments: Bundle? = null

  val listnameofcollegeList: MutableLiveData<MutableList<ListnameofcollegeRowModel>> =
      MutableLiveData(mutableListOf())
}
