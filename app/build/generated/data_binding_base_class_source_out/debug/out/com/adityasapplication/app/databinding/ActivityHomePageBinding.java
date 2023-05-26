// Generated by data binding compiler. Do not edit!
package com.adityasapplication.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.adityasapplication.app.R;
import com.adityasapplication.app.modules.homepage.data.viewmodel.HomePageVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityHomePageBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnFrequentlyAskedQuestions;

  @NonNull
  public final EditText etGroupTwentyEight;

  @NonNull
  public final EditText etGroupTwentySeven;

  @NonNull
  public final FrameLayout frameStackhome;

  @NonNull
  public final FrameLayout frameStackquestion;

  @NonNull
  public final FrameLayout frameStacktelevision;

  @NonNull
  public final ImageView imageHome;

  @NonNull
  public final ImageView imageHomeOne;

  @NonNull
  public final ImageView imageMaterialsymbol;

  @NonNull
  public final ImageView imageMenu;

  @NonNull
  public final ImageView imageSearch;

  @NonNull
  public final ImageView imageSearchOne;

  @NonNull
  public final ImageView imageTelevision;

  @NonNull
  public final ImageView imageUser;

  @NonNull
  public final View lineLineTwo;

  @NonNull
  public final LinearLayout linearColumnanswer;

  @NonNull
  public final LinearLayout linearColumnhome;

  @NonNull
  public final LinearLayout linearColumnmenu;

  @NonNull
  public final LinearLayout linearColumnquestion;

  @NonNull
  public final LinearLayout linearColumnquestionOne;

  @NonNull
  public final LinearLayout linearColumnquestionTwo;

  @NonNull
  public final LinearLayout linearHOMEPAGE;

  @NonNull
  public final LinearLayout linearQNA;

  @NonNull
  public final LinearLayout linearRowhome;

  @NonNull
  public final LinearLayout linearRowhomeTwo;

  @NonNull
  public final LinearLayout linearRowmaterialsymbol;

  @NonNull
  public final LinearLayout linearRowmenu;

  @NonNull
  public final LinearLayout linearRowsearchOne;

  @NonNull
  public final ScrollView scrollViewScrollview;

  @NonNull
  public final Toolbar toolbarToolbar;

  @NonNull
  public final TextView txtAnswer;

  @NonNull
  public final TextView txtCollegePredict;

  @NonNull
  public final TextView txtDescription;

  @NonNull
  public final TextView txtDescriptionOne;

  @NonNull
  public final TextView txtDetails;

  @NonNull
  public final TextView txtHomeTwo;

  @NonNull
  public final TextView txtKYC;

  @NonNull
  public final TextView txtKnowYourColle;

  @NonNull
  public final TextView txtLive;

  @NonNull
  public final TextView txtProfile;

  @NonNull
  public final TextView txtQuestion;

  @NonNull
  public final TextView txtQuestionOne;

  @NonNull
  public final TextView txtQuestionTwo;

  @Bindable
  protected HomePageVM mHomePageVM;

  protected ActivityHomePageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnFrequentlyAskedQuestions, EditText etGroupTwentyEight,
      EditText etGroupTwentySeven, FrameLayout frameStackhome, FrameLayout frameStackquestion,
      FrameLayout frameStacktelevision, ImageView imageHome, ImageView imageHomeOne,
      ImageView imageMaterialsymbol, ImageView imageMenu, ImageView imageSearch,
      ImageView imageSearchOne, ImageView imageTelevision, ImageView imageUser, View lineLineTwo,
      LinearLayout linearColumnanswer, LinearLayout linearColumnhome, LinearLayout linearColumnmenu,
      LinearLayout linearColumnquestion, LinearLayout linearColumnquestionOne,
      LinearLayout linearColumnquestionTwo, LinearLayout linearHOMEPAGE, LinearLayout linearQNA,
      LinearLayout linearRowhome, LinearLayout linearRowhomeTwo,
      LinearLayout linearRowmaterialsymbol, LinearLayout linearRowmenu,
      LinearLayout linearRowsearchOne, ScrollView scrollViewScrollview, Toolbar toolbarToolbar,
      TextView txtAnswer, TextView txtCollegePredict, TextView txtDescription,
      TextView txtDescriptionOne, TextView txtDetails, TextView txtHomeTwo, TextView txtKYC,
      TextView txtKnowYourColle, TextView txtLive, TextView txtProfile, TextView txtQuestion,
      TextView txtQuestionOne, TextView txtQuestionTwo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnFrequentlyAskedQuestions = btnFrequentlyAskedQuestions;
    this.etGroupTwentyEight = etGroupTwentyEight;
    this.etGroupTwentySeven = etGroupTwentySeven;
    this.frameStackhome = frameStackhome;
    this.frameStackquestion = frameStackquestion;
    this.frameStacktelevision = frameStacktelevision;
    this.imageHome = imageHome;
    this.imageHomeOne = imageHomeOne;
    this.imageMaterialsymbol = imageMaterialsymbol;
    this.imageMenu = imageMenu;
    this.imageSearch = imageSearch;
    this.imageSearchOne = imageSearchOne;
    this.imageTelevision = imageTelevision;
    this.imageUser = imageUser;
    this.lineLineTwo = lineLineTwo;
    this.linearColumnanswer = linearColumnanswer;
    this.linearColumnhome = linearColumnhome;
    this.linearColumnmenu = linearColumnmenu;
    this.linearColumnquestion = linearColumnquestion;
    this.linearColumnquestionOne = linearColumnquestionOne;
    this.linearColumnquestionTwo = linearColumnquestionTwo;
    this.linearHOMEPAGE = linearHOMEPAGE;
    this.linearQNA = linearQNA;
    this.linearRowhome = linearRowhome;
    this.linearRowhomeTwo = linearRowhomeTwo;
    this.linearRowmaterialsymbol = linearRowmaterialsymbol;
    this.linearRowmenu = linearRowmenu;
    this.linearRowsearchOne = linearRowsearchOne;
    this.scrollViewScrollview = scrollViewScrollview;
    this.toolbarToolbar = toolbarToolbar;
    this.txtAnswer = txtAnswer;
    this.txtCollegePredict = txtCollegePredict;
    this.txtDescription = txtDescription;
    this.txtDescriptionOne = txtDescriptionOne;
    this.txtDetails = txtDetails;
    this.txtHomeTwo = txtHomeTwo;
    this.txtKYC = txtKYC;
    this.txtKnowYourColle = txtKnowYourColle;
    this.txtLive = txtLive;
    this.txtProfile = txtProfile;
    this.txtQuestion = txtQuestion;
    this.txtQuestionOne = txtQuestionOne;
    this.txtQuestionTwo = txtQuestionTwo;
  }

  public abstract void setHomePageVM(@Nullable HomePageVM homePageVM);

  @Nullable
  public HomePageVM getHomePageVM() {
    return mHomePageVM;
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_home_page, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityHomePageBinding>inflateInternal(inflater, R.layout.activity_home_page, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_home_page, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityHomePageBinding>inflateInternal(inflater, R.layout.activity_home_page, null, false, component);
  }

  public static ActivityHomePageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityHomePageBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityHomePageBinding)bind(component, view, R.layout.activity_home_page);
  }
}
