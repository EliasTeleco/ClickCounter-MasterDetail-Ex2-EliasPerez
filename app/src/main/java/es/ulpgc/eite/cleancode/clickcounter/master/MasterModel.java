package es.ulpgc.eite.cleancode.clickcounter.master;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.clickcounter.data.CounterData;

public class MasterModel implements MasterContract.Model {

  public static String TAG = "ClickCounter-MasterDetail.MasterModel";

  private List<CounterData> datasource;

  public MasterModel() {
    datasource = new ArrayList<>();
  }

  @Override
  public List<CounterData> getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return datasource;
  }

  @Override
  public void onRestartScreen(List<CounterData> datasource) {
    // Log.e(TAG, "onRestartScreen()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");

    // TODO: add code if is necessary
  }
}
