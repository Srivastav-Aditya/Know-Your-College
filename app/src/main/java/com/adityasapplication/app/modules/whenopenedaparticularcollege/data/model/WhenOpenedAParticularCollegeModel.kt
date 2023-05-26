package com.adityasapplication.app.modules.whenopenedaparticularcollege.`data`.model

import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WhenOpenedAParticularCollegeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollege: String? = MyApp.getInstance().resources.getString(R.string.lbl_college2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIITBOMBAY: String? = MyApp.getInstance().resources.getString(R.string.lbl_iit_bombay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBranch: String? = MyApp.getInstance().resources.getString(R.string.lbl_branch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotos: String? = MyApp.getInstance().resources.getString(R.string.lbl_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnnualPackage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_annual_package)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFees: String? = MyApp.getInstance().resources.getString(R.string.lbl_fees)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlacenments: String? = MyApp.getInstance().resources.getString(R.string.lbl_placenments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameofCollege: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_college)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotoCLicking: String? =
      MyApp.getInstance().resources.getString(R.string.msg_photo_clicking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameofCollegeOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_college)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotoCLickingOne: String? =
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

)
