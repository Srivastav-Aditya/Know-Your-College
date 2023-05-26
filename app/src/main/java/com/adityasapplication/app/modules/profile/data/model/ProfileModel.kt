package com.adityasapplication.app.modules.profile.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
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
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotfications: String? = MyApp.getInstance().resources.getString(R.string.lbl_notfications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduledCalls: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_scheduled_calls)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPendingSession: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pending_session)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAskYourDoubts: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ask_your_doubts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEgWhatisth: String? = MyApp.getInstance().resources.getString(R.string.msg_eg_what_is_th)
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
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
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
  var etGroupFiftyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etMobileNoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftySixValue: String? = null
)
