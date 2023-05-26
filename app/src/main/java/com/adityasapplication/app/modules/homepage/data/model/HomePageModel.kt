package com.adityasapplication.app.modules.homepage.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKYC: String? = MyApp.getInstance().resources.getString(R.string.lbl_kyc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKnowYourColle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_know_your_colle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_kyc_a_one_stop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_get_your_desire)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuestion: String? = MyApp.getInstance().resources.getString(R.string.lbl_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnswer: String? = MyApp.getInstance().resources.getString(R.string.lbl_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuestionOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuestionTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_question)
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
  var etGroupTwentySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyEightValue: String? = null
)
