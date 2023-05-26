package com.adityasapplication.app.modules.mentorsignup.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MentorSignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMentor: String? = MyApp.getInstance().resources.getString(R.string.lbl_mentor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddGroupPictu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_group_pictu)
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
  var txtCollege: String? = MyApp.getInstance().resources.getString(R.string.lbl_college2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStream: String? = MyApp.getInstance().resources.getString(R.string.lbl_stream)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYear: String? = MyApp.getInstance().resources.getString(R.string.lbl_year)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)
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
  var txtCollegePredict: String? =
      MyApp.getInstance().resources.getString(R.string.msg_college_predict)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventeenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEighteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyValue: String? = null
)
