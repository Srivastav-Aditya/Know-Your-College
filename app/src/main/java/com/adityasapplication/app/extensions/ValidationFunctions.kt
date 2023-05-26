package com.adityasapplication.app.extensions

import android.telephony.PhoneNumberUtils
import android.util.Patterns
import android.widget.Toast
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.di.MyApp
import kotlin.Boolean
import kotlin.String

public fun String?.isValidPhone(isMandatory: Boolean = false): Boolean {
  if (isNullOrEmpty()) {
    if (isMandatory) {
      Toast.makeText(
              MyApp.getInstance(),
              R.string.msg_please_enter_valid_phone_nu,
              Toast.LENGTH_SHORT
          ).show()
    }
    return !isMandatory
  }
  val result = 
  PhoneNumberUtils.isGlobalPhoneNumber(this)
  if (!result) {
    Toast.makeText(
            MyApp.getInstance(),
            R.string.msg_please_enter_valid_phone_nu,
            Toast.LENGTH_SHORT
        ).show()
  }
  return result
}

public fun String?.isValidEmail(isMandatory: Boolean = false): Boolean {
  if (isNullOrEmpty()) {
    if (isMandatory) {
      Toast.makeText(
              MyApp.getInstance(),
              R.string.msg_please_enter_valid_email,
              Toast.LENGTH_SHORT
          ).show()
    }
    return !isMandatory
  }
  val result = 
  Patterns.EMAIL_ADDRESS.matcher(this).matches()
  if (!result) {
    Toast.makeText(
            MyApp.getInstance(),
            R.string.msg_please_enter_valid_email,
            Toast.LENGTH_SHORT
        ).show()
  }
  return result
}
