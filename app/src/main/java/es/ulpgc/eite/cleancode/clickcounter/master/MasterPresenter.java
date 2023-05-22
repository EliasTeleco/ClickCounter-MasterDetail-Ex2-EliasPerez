package es.ulpgc.eite.cleancode.clickcounter.master;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.clickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.clickcounter.app.DetailToMasterState;
import es.ulpgc.eite.cleancode.clickcounter.app.MasterToDetailState;
import es.ulpgc.eite.cleancode.clickcounter.data.CounterData;

public class MasterPresenter implements MasterContract.Presenter {

  public static String TAG = "ClickCounter-MasterDetail.MasterPresenter";

  private WeakReference<MasterContract.View> view;
  private MasterState state;
  private MasterContract.Model model;
  private AppMediator mediator;

  public MasterPresenter(AppMediator mediator) {
    this.mediator = mediator;
    state = mediator.getMasterState();

  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state 
    if (state == null) {
      state = new MasterState();
    }
    state.clicks = "0";
  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    model.onRestartScreen(state.datasource);

  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    DetailToMasterState savedState = getStateFromNextScreen();
    if (savedState != null) {

      // update the model if is necessary
      for(int i = 0; i < state.datasource.size(); i ++){
        if(state.datasource.get(i).id == state.id){
          int a = Integer.parseInt(savedState.data);
          state.datasource.get(i).value = a;
        }
      }
      state.clicks = savedState.clicks;

    }

    // call the model and update the state
    state.datasource = model.getStoredData();
    // update the view
    view.get().onDataUpdated(state);
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

  private void passStateToNextScreen(MasterToDetailState state) {
    mediator.setNextMasterScreenState(state);
  }


  private DetailToMasterState getStateFromNextScreen() {
    return mediator.getNextMasterScreenState();
  }

  @Override
  public void onButtonPressed() {

    Log.e(TAG, "onButtonPressed()");
    model.addNumero();
    state.datasource = model.getStoredData();
    onResume();
  }

  @Override
  public void injectView(WeakReference<MasterContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(MasterContract.Model model) {
    this.model = model;
  }

  @Override
  public void selectElement(CounterData elemento) {

    MasterToDetailState estado = new MasterToDetailState();

    state.id = elemento.id;

    int a = elemento.value + 1;
    estado.data = a + "";

    int b = Integer.parseInt(state.clicks);
    b ++;
    estado.clicks = b + "";

    passStateToNextScreen(estado);
    view.get().navigateToNextScreen();
  }

}
