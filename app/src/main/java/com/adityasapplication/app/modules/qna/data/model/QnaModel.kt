package com.adityasapplication.app.modules.qna.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class QnaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtQnA: String? = MyApp.getInstance().resources.getString(R.string.lbl_qna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuestion: String? = MyApp.getInstance().resources.getString(R.string.lbl_question)
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
  var txtQuestionThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuestionFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuestionFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupElevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwelveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFifteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixteenValue: String? = null
)
