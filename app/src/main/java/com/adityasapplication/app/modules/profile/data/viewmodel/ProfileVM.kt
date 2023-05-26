package com.adityasapplication.app.modules.profile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.profile.`data`.model.ProfileModel
import com.adityasapplication.app.modules.profile.`data`.model.SpinnerGroupFiftyEightModel
import com.adityasapplication.app.modules.profile.`data`.model.SpinnerGroupFiftyNineModel
import com.adityasapplication.app.modules.profile.`data`.model.SpinnerGroupFiftySevenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileVM : ViewModel(), KoinComponent {
  val profileModel: MutableLiveData<ProfileModel> = MutableLiveData(ProfileModel())

  var navArguments: Bundle? = null

  val spinnerGroupFiftySevenList: MutableLiveData<MutableList<SpinnerGroupFiftySevenModel>> =
      MutableLiveData()

  val spinnerGroupFiftyEightList: MutableLiveData<MutableList<SpinnerGroupFiftyEightModel>> =
      MutableLiveData()

  val spinnerGroupFiftyNineList: MutableLiveData<MutableList<SpinnerGroupFiftyNineModel>> =
      MutableLiveData()
}
