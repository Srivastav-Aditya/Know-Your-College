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
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.adityasapplication.app.R;
import com.adityasapplication.app.modules.profilenotlogin.data.viewmodel.ProfileNotLogInVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityProfileNotLogInBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnRegister;

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
  public final View lineLineTwo;

  @NonNull
  public final LinearLayout linearColumnhome;

  @NonNull
  public final LinearLayout linearProfilenotLog;

  @NonNull
  public final LinearLayout linearRowhome;

  @NonNull
  public final LinearLayout linearRowhomeTwo;

  @NonNull
  public final LinearLayout linearRowmaterialsymbol;

  @NonNull
  public final LinearLayout linearRowsearch;

  @NonNull
  public final TextView txtCONNECTWITHTH;

  @NonNull
  public final TextView txtCollegePredict;

  @NonNull
  public final TextView txtDetails;

  @NonNull
  public final TextView txtGETREALINSIGH;

  @NonNull
  public final TextView txtHomeTwo;

  @NonNull
  public final TextView txtKINDLYREGISTER;

  @NonNull
  public final TextView txtLive;

  @NonNull
  public final TextView txtProfile;

  @NonNull
  public final TextView txtProfileOne;

  @Bindable
  protected ProfileNotLogInVM mProfileNotLogInVM;

  protected ActivityProfileNotLogInBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnRegister, FrameLayout frameStackhome,
      FrameLayout frameStacktelevision, ImageView imageHome, ImageView imageHomeOne,
      ImageView imageMaterialsymbol, ImageView imageSearch, ImageView imageTelevision,
      ImageView imageUser, View lineLineTwo, LinearLayout linearColumnhome,
      LinearLayout linearProfilenotLog, LinearLayout linearRowhome, LinearLayout linearRowhomeTwo,
      LinearLayout linearRowmaterialsymbol, LinearLayout linearRowsearch, TextView txtCONNECTWITHTH,
      TextView txtCollegePredict, TextView txtDetails, TextView txtGETREALINSIGH,
      TextView txtHomeTwo, TextView txtKINDLYREGISTER, TextView txtLive, TextView txtProfile,
      TextView txtProfileOne) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRegister = btnRegister;
    this.frameStackhome = frameStackhome;
    this.frameStacktelevision = frameStacktelevision;
    this.imageHome = imageHome;
    this.imageHomeOne = imageHomeOne;
    this.imageMaterialsymbol = imageMaterialsymbol;
    this.imageSearch = imageSearch;
    this.imageTelevision = imageTelevision;
    this.imageUser = imageUser;
    this.lineLineTwo = lineLineTwo;
    this.linearColumnhome = linearColumnhome;
    this.linearProfilenotLog = linearProfilenotLog;
    this.linearRowhome = linearRowhome;
    this.linearRowhomeTwo = linearRowhomeTwo;
    this.linearRowmaterialsymbol = linearRowmaterialsymbol;
    this.linearRowsearch = linearRowsearch;
    this.txtCONNECTWITHTH = txtCONNECTWITHTH;
    this.txtCollegePredict = txtCollegePredict;
    this.txtDetails = txtDetails;
    this.txtGETREALINSIGH = txtGETREALINSIGH;
    this.txtHomeTwo = txtHomeTwo;
    this.txtKINDLYREGISTER = txtKINDLYREGISTER;
    this.txtLive = txtLive;
    this.txtProfile = txtProfile;
    this.txtProfileOne = txtProfileOne;
  }

  public abstract void setProfileNotLogInVM(@Nullable ProfileNotLogInVM profileNotLogInVM);

  @Nullable
  public ProfileNotLogInVM getProfileNotLogInVM() {
    return mProfileNotLogInVM;
  }

  @NonNull
  public static ActivityProfileNotLogInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_profile_not_log_in, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityProfileNotLogInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityProfileNotLogInBinding>inflateInternal(inflater, R.layout.activity_profile_not_log_in, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityProfileNotLogInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_profile_not_log_in, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityProfileNotLogInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityProfileNotLogInBinding>inflateInternal(inflater, R.layout.activity_profile_not_log_in, null, false, component);
  }

  public static ActivityProfileNotLogInBinding bind(@NonNull View view) {
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
  public static ActivityProfileNotLogInBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityProfileNotLogInBinding)bind(component, view, R.layout.activity_profile_not_log_in);
  }
}
