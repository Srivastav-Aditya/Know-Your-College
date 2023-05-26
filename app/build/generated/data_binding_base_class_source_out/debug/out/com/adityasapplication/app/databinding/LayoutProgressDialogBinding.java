// Generated by data binding compiler. Do not edit!
package com.adityasapplication.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.adityasapplication.app.R;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutProgressDialogBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final TextView textProgressBar;

  @Bindable
  protected String mMessage;

  protected LayoutProgressDialogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LottieAnimationView animationView, TextView textProgressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animationView = animationView;
    this.textProgressBar = textProgressBar;
  }

  public abstract void setMessage(@Nullable String message);

  @Nullable
  public String getMessage() {
    return mMessage;
  }

  @NonNull
  public static LayoutProgressDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_progress_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutProgressDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutProgressDialogBinding>inflateInternal(inflater, R.layout.layout_progress_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutProgressDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_progress_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutProgressDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutProgressDialogBinding>inflateInternal(inflater, R.layout.layout_progress_dialog, null, false, component);
  }

  public static LayoutProgressDialogBinding bind(@NonNull View view) {
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
  public static LayoutProgressDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutProgressDialogBinding)bind(component, view, R.layout.layout_progress_dialog);
  }
}
