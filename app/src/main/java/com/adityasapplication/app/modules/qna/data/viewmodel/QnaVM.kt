package com.adityasapplication.app.modules.qna.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.qna.`data`.model.QnaModel
import org.koin.core.KoinComponent

class QnaVM : ViewModel(), KoinComponent {
  val qnaModel: MutableLiveData<QnaModel> = MutableLiveData(QnaModel())

  var navArguments: Bundle? = null
}
