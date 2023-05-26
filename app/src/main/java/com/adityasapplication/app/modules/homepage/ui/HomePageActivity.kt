package com.adityasapplication.app.modules.homepage.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.adityasapplication.app.R
import com.adityasapplication.app.appcomponents.base.BaseActivity
import com.adityasapplication.app.databinding.ActivityHomePageBinding
import com.adityasapplication.app.modules.collegedetails.ui.CollegeDetailsActivity
import com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.ui.CollegeDetailsAfterCollegePredictorActivity
import com.adityasapplication.app.modules.collegepredictor.ui.CollegePredictorActivity
import com.adityasapplication.app.modules.homepage.`data`.viewmodel.HomePageVM
import com.adityasapplication.app.modules.livesession.ui.LiveSessionActivity
import com.adityasapplication.app.modules.menu.ui.MenuActivity
import com.adityasapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  private val REQUEST_CODE_MENU_ACTIVITY: Int = 274

  private val REQUEST_CODE_COLLEGE_PREDICTOR_ACTIVITY: Int = 941

  private val REQUEST_CODE_COLLEGE_DETAILS_AFTER_COLLEGE_PREDICTOR_ACTIVITY: Int = 975

  private val REQUEST_CODE_SEARCH_ACTIVITY: Int = 125

  private val REQUEST_CODE_COLLEGE_DETAILS_ACTIVITY: Int = 457

  private val REQUEST_CODE_LIVE_SESSION_ACTIVITY: Int = 646

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homePageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = CollegeDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageMenu.setOnClickListener {
        val destIntent = MenuActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_MENU_ACTIVITY)
      }
      binding.imageSearchOne.setOnClickListener {
        val destIntent = CollegePredictorActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_COLLEGE_PREDICTOR_ACTIVITY)
      }
      binding.imageTelevision.setOnClickListener {
        val destIntent = CollegeDetailsAfterCollegePredictorActivity.getIntent(this, null)
        startActivityForResult(destIntent,
            REQUEST_CODE_COLLEGE_DETAILS_AFTER_COLLEGE_PREDICTOR_ACTIVITY)
      }
      binding.imageSearch.setOnClickListener {
        val destIntent = SearchActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_SEARCH_ACTIVITY)
      }
      binding.imageHome.setOnClickListener {
        val destIntent = CollegeDetailsActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_COLLEGE_DETAILS_ACTIVITY)
      }
      binding.imageUser.setOnClickListener {
        val destIntent = LiveSessionActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_LIVE_SESSION_ACTIVITY)
      }
    }

    companion object {
      const val TAG: String = "HOME_PAGE_ACTIVITY"

    }
  }
