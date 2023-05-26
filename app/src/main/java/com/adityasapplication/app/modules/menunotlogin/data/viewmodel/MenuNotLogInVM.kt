package com.adityasapplication.app.modules.menunotlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.menunotlogin.`data`.model.MenuNotLogInModel
import org.koin.core.KoinComponent

class MenuNotLogInVM : ViewModel(), KoinComponent {
  val menuNotLogInModel: MutableLiveData<MenuNotLogInModel> = MutableLiveData(MenuNotLogInModel())

  var navArguments: Bundle? = null
}
