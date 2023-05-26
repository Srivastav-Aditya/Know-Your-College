// Generated by data binding compiler. Do not edit!
package com.adityasapplication.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.adityasapplication.app.R;
import com.adityasapplication.app.modules.collegedetails.data.viewmodel.CollegeDetailsVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCollegeDetailsBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout frameStackhome;

  @NonNull
  public final FrameLayout frameStacktelevision;

  @NonNull
  public final ImageView imageHome;

  @NonNull
  public final ImageView imageHomeOne;

  @NonNull
  public final ImageView imageMaterialsymbol;

  @NonNull
  public final ImageView imageSearch;

  @NonNull
  public final ImageView imageTelevision;

  @NonNull
  public final ImageView imageUser;

  @NonNull
  public final View lineLineFour;

  @NonNull
  public final View lineLineTwo;

  @NonNull
  public final LinearLayout linearCollegeDetails;

  @NonNull
  public final LinearLayout linearColumnhome;

  @NonNull
  public final LinearLayout linearColumnphotoclickingTwo;

  @NonNull
  public final LinearLayout linearColumntitleofblogTwo;

  @NonNull
  public final LinearLayout linearRowhome;

  @NonNull
  public final LinearLayout linearRowhomeTwo;

  @NonNull
  public final LinearLayout linearRowmaterialsymbol;

  @NonNull
  public final LinearLayout linearRowsearch;

  @NonNull
  public final RecyclerView recyclerListtitleofblog;

  @NonNull
  public final TextView txtCollegePredict;

  @NonNull
  public final TextView txtDetails;

  @NonNull
  public final TextView txtDetailsOne;

  @NonNull
  public final TextView txtHomeTwo;

  @NonNull
  public final TextView txtLive;

  @NonNull
  public final TextView txtPhotoCLickingTwo;

  @NonNull
  public final TextView txtProfile;

  @NonNull
  public final TextView txtTitleofBlogTwo;

  @Bindable
  protected CollegeDetailsVM mCollegeDetailsVM;

  protected ActivityCollegeDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout frameStackhome, FrameLayout frameStacktelevision,
      ImageView imageHome, ImageView imageHomeOne, ImageView imageMaterialsymbol,
      ImageView imageSearch, ImageView imageTelevision, ImageView imageUser, View lineLineFour,
      View lineLineTwo, LinearLayout linearCollegeDetails, LinearLayout linearColumnhome,
      LinearLayout linearColumnphotoclickingTwo, LinearLayout linearColumntitleofblogTwo,
      LinearLayout linearRowhome, LinearLayout linearRowhomeTwo,
      LinearLayout linearRowmaterialsymbol, LinearLayout linearRowsearch,
      RecyclerView recyclerListtitleofblog, TextView txtCollegePredict, TextView txtDetails,
      TextView txtDetailsOne, TextView txtHomeTwo, TextView txtLive, TextView txtPhotoCLickingTwo,
      TextView txtProfile, TextView txtTitleofBlogTwo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameStackhome = frameStackhome;
    this.frameStacktelevision = frameStacktelevision;
    this.imageHome = imageHome;
    this.imageHomeOne = imageHomeOne;
    this.imageMaterialsymbol = imageMaterialsymbol;
    this.imageSearch = imageSearch;
    this.imageTelevision = imageTelevision;
    this.imageUser = imageUser;
    this.lineLineFour = lineLineFour;
    this.lineLineTwo = lineLineTwo;
    this.linearCollegeDetails = linearCollegeDetails;
    this.linearColumnhome = linearColumnhome;
    this.linearColumnphotoclickingTwo = linearColumnphotoclickingTwo;
    this.linearColumntitleofblogTwo = linearColumntitleofblogTwo;
    this.linearRowhome = linearRowhome;
    this.linearRowhomeTwo = linearRowhomeTwo;
    this.linearRowmaterialsymbol = linearRowmaterialsymbol;
    this.linearRowsearch = linearRowsearch;
    this.recyclerListtitleofblog = recyclerListtitleofblog;
    this.txtCollegePredict = txtCollegePredict;
    this.txtDetails = txtDetails;
    this.txtDetailsOne = txtDetailsOne;
    this.txtHomeTwo = txtHomeTwo;
    this.txtLive = txtLive;
    this.txtPhotoCLickingTwo = txtPhotoCLickingTwo;
    this.txtProfile = txtProfile;
    this.txtTitleofBlogTwo = txtTitleofBlogTwo;
  }

  public abstract void setCollegeDetailsVM(@Nullable CollegeDetailsVM collegeDetailsVM);

  @Nullable
  public CollegeDetailsVM getCollegeDetailsVM() {
    return mCollegeDetailsVM;
  }

  @NonNull
  public static ActivityCollegeDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_college_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCollegeDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCollegeDetailsBinding>inflateInternal(inflater, R.layout.activity_college_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCollegeDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_college_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCollegeDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCollegeDetailsBinding>inflateInternal(inflater, R.layout.activity_college_details, null, false, component);
  }

  public static ActivityCollegeDetailsBinding bind(@NonNull View view) {
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
  public static ActivityCollegeDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCollegeDetailsBinding)bind(component, view, R.layout.activity_college_details);
  }
}
