package com.adityasapplication.app.modules.profilenotlogin.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileNotLogInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKINDLYREGISTER: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindly_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCONNECTWITHTH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_connect_with_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGETREALINSIGH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_get_real_insigh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
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
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
