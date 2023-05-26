package com.adityasapplication.app.modules.collegedetails.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CollegeDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleofBlogTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_title_of_blog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotoCLickingTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_photo_clicking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCollegePredict: String? =
      MyApp.getInstance().resources.getString(R.string.msg_college_predict)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLive: String? = MyApp.getInstance().resources.getString(R.string.lbl_live)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
