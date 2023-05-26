package com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListnameofcollegeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNameofCollege: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_college)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotoCLicking: String? =
      MyApp.getInstance().resources.getString(R.string.msg_photo_clicking)

)
