package com.adityasapplication.app.modules.search.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKYC: String? = MyApp.getInstance().resources.getString(R.string.lbl_kyc)
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
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKeyBoard: String? = MyApp.getInstance().resources.getString(R.string.lbl_keyboard)

)
