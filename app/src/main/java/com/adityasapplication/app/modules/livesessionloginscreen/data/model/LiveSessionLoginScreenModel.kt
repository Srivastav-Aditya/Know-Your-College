package com.adityasapplication.app.modules.livesessionloginscreen.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LiveSessionLoginScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLiveSession: String? = MyApp.getInstance().resources.getString(R.string.lbl_live_session)
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
  var txtWhatsappNumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_whatsapp_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCollegeOfwhic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_college_of_whic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentLink: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment_link)
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
  var etGroupOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null
)
