package com.adityasapplication.app.modules.searchsuggestions.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivitySearchSuggestionsBinding
import com.adityasapplication.app.modules.searchsuggestions.`data`.viewmodel.SearchSuggestionsVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SearchSuggestionsActivity :
    BaseActivity<ActivitySearchSuggestionsBinding>(R.layout.activity_search_suggestions) {
  private val viewModel: SearchSuggestionsVM by viewModels<SearchSuggestionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchSuggestionsVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
  }

  private fun setUpSearchViewSearchBarListener(): Unit {
    binding.searchViewSearchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_SUGGESTIONS_ACTIVITY"

    }
  }
