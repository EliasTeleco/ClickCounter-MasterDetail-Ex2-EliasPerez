package es.ulpgc.eite.cleancode.clickcounter.detail;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.clickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.clickcounter.app.DetailToMasterState;
import es.ulpgc.eite.cleancode.clickcounter.app.MasterToDetailState;
import es.ulpgc.eite.cleancode.clickcounter.master.MasterActivity;

public class DetailPresenter implements DetailContract.Presenter {

  public static String TAG = "ClickCounter-MasterDetail.DetailPresenter";

  private WeakReference<DetailContract.View> view;
  private DetailState state;
  private DetailContract.Model model;
  private AppMediator mediator;

  public DetailPresenter(AppMediator mediator) {
    this.mediator = mediator;

    //Hace que se guarde bien el estado al girar la pantalla
      state= mediator.getDetailState();



  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state 
    if (state == null) {
      state = new DetailState();
    }

    MasterToDetailState savedState = getStateFromPreviousScreen();
    if (savedState != null) {
      model.onDataFromPreviousScreen(savedState.data);
      state.clicks = savedState.clicks;
    }

  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");


    model.onRestartScreen(state.data);
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // TODO: add code if is necessary
    state.data = model.getStoredData();

    // update the view
    view.get().onDataUpdated(state);
  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");

    // TODO: add code if is necessary
    DetailToMasterState estado= new DetailToMasterState();
    estado.data= state.data;
    estado.clicks= state.clicks;
    passStateToPreviousScreen(estado);
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

    model.aumentarNumero();
    state.data = model.getStoredData();

    int b = Integer.parseInt(state.clicks);
    b ++;
    state.clicks = b + "";
    onResume();
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
