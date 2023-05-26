package com.adityasapplication.app.modules.search.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivitySearchBinding
import com.adityasapplication.app.modules.search.`data`.viewmodel.SearchVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SearchActivity : BaseActivity<ActivitySearchBinding>(R.layout.activity_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchVM = viewModel
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
      const val TAG: String = "SEARCH_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
