package com.adityasapplication.app.modules.collegedetails.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListtitleofblogRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleofBlog: String? = MyApp.getInstance().resources.getString(R.string.lbl_title_of_blog)
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
