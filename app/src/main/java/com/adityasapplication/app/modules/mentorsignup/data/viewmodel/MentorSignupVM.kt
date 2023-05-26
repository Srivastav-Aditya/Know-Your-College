package com.adityasapplication.app.modules.mentorsignup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.mentorsignup.`data`.model.MentorSignupModel
import com.adityasapplication.app.modules.mentorsignup.`data`.model.SpinnerGroupTwentyOneModel
import com.adityasapplication.app.modules.mentorsignup.`data`.model.SpinnerGroupTwentyTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MentorSignupVM : ViewModel(), KoinComponent {
  val mentorSignupModel: MutableLiveData<MentorSignupModel> = MutableLiveData(MentorSignupModel())

  var navArguments: Bundle? = null

  val spinnerGroupTwentyOneList: MutableLiveData<MutableList<SpinnerGroupTwentyOneModel>> =
      MutableLiveData()

  val spinnerGroupTwentyTwoList: MutableLiveData<MutableList<SpinnerGroupTwentyTwoModel>> =
      MutableLiveData()
}
