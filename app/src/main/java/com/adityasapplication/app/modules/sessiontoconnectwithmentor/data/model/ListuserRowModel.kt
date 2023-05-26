package com.adityasapplication.app.modules.sessiontoconnectwithmentor.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListuserRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailisofthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_detailis_of_the)

)
