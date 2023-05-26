package com.adityasapplication.app.modules.collegepredictor.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CollegePredictorModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollegePredict: String? =
      MyApp.getInstance().resources.getString(R.string.msg_college_predict)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullName: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailId: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScore: String? = MyApp.getInstance().resources.getString(R.string.lbl_score)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
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
  var txtCollegePredictOne: String? =
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
  var etGroupSeventyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventySixValue: String? = null
)
