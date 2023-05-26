package com.adityasapplication.app.modules.searchsuggestions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityasapplication.app.modules.searchsuggestions.`data`.model.SearchSuggestionsModel
import org.koin.core.KoinComponent

class SearchSuggestionsVM : ViewModel(), KoinComponent {
  val searchSuggestionsModel: MutableLiveData<SearchSuggestionsModel> =
      MutableLiveData(SearchSuggestionsModel())

  var navArguments: Bundle? = null
}
