package es.ulpgc.eite.cleancode.clickcounter.detail;

public class DetailModel implements DetailContract.Model {

  public static String TAG = "ClickCounter-MasterDetail.DetailModel";

  private String data;

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");

    this.data = data;
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");

    this.data= data;
  }

  @Override
  public void aumentarNumero() {
    int a = Integer.parseInt(this.data);
    a ++;
    this.data = a + "";
  }
}
