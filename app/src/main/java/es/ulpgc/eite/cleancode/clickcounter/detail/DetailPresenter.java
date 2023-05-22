package es.ulpgc.eite.cleancode.clickcounter.detail;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.clickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.clickcounter.app.DetailToMasterState;
import es.ulpgc.eite.cleancode.clickcounter.app.MasterToDetailState;

public class DetailPresenter implements DetailContract.Presenter {

  public static String TAG = "ClickCounter-MasterDetail.DetailPresenter";

  private WeakReference<DetailContract.View> view;
  private DetailState state;
  private DetailContract.Model model;
  private AppMediator mediator;

  public DetailPresenter(AppMediator mediator) {
    this.mediator = mediator;
    
  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state 
    state = new DetailState();

    // TODO: add code if is necessary
  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // TODO: add code if is necessary
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // TODO: add code if is necessary

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");

    // TODO: add code if is necessary
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");

    // TODO: add code if is necessary
  }

  @Override
  public void onButtonPressed() {
    Log.e(TAG, "onButtonPressed()");

    // TODO: add code if is necessary
  }

  private void passStateToPreviousScreen(DetailToMasterState state) {
    mediator.setPreviousDetailScreenState(state);
  }

  private MasterToDetailState getStateFromPreviousScreen() {
    return mediator.getPreviousDetailScreenState();
  }

  @Override
  public void injectView(WeakReference<DetailContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(DetailContract.Model model) {
    this.model = model;
  }


}
