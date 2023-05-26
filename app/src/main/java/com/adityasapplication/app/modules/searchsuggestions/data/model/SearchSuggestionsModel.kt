package com.adityasapplication.app.modules.searchsuggestions.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchSuggestionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKYC: String? = MyApp.getInstance().resources.getString(R.string.lbl_kyc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggestions: String? = MyApp.getInstance().resources.getString(R.string.lbl_suggestions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggestionsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_annual_package)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggestionsTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_campus_of_iit_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggestionsThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_faculties_of_ii)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggestionsFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reviews_of_iit)
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
