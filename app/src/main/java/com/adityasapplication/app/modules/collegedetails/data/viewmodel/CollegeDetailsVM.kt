package com.adityasapplication.app.modules.collegedetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.collegedetails.`data`.model.CollegeDetailsModel
import com.adityasapplication.app.modules.collegedetails.`data`.model.ListtitleofblogRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CollegeDetailsVM : ViewModel(), KoinComponent {
  val collegeDetailsModel: MutableLiveData<CollegeDetailsModel> =
      MutableLiveData(CollegeDetailsModel())

  var navArguments: Bundle? = null

  val listtitleofblogList: MutableLiveData<MutableList<ListtitleofblogRowModel>> =
      MutableLiveData(mutableListOf())
}
