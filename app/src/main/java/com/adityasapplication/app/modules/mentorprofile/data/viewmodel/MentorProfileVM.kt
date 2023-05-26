package com.adityasapplication.app.modules.mentorprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.mentorprofile.`data`.model.MentorProfileModel
import com.adityasapplication.app.modules.mentorprofile.`data`.model.SpinnerGroupFortyFiveModel
import com.adityasapplication.app.modules.mentorprofile.`data`.model.SpinnerGroupFortyFourModel
import com.adityasapplication.app.modules.mentorprofile.`data`.model.SpinnerGroupFortyThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MentorProfileVM : ViewModel(), KoinComponent {
  val mentorProfileModel: MutableLiveData<MentorProfileModel> =
      MutableLiveData(MentorProfileModel())

  var navArguments: Bundle? = null

  val spinnerGroupFortyThreeList: MutableLiveData<MutableList<SpinnerGroupFortyThreeModel>> =
      MutableLiveData()

  val spinnerGroupFortyFourList: MutableLiveData<MutableList<SpinnerGroupFortyFourModel>> =
      MutableLiveData()

  val spinnerGroupFortyFiveList: MutableLiveData<MutableList<SpinnerGroupFortyFiveModel>> =
      MutableLiveData()
}
