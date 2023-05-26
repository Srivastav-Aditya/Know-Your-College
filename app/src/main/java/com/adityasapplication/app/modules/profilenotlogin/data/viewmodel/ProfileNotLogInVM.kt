package com.adityasapplication.app.modules.profilenotlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.profilenotlogin.`data`.model.ProfileNotLogInModel
import org.koin.core.KoinComponent

class ProfileNotLogInVM : ViewModel(), KoinComponent {
  val profileNotLogInModel: MutableLiveData<ProfileNotLogInModel> =
      MutableLiveData(ProfileNotLogInModel())

  var navArguments: Bundle? = null
}
