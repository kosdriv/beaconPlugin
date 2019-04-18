package com.smartnav.cordova.plugin;

import android.util.Log;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class BeaconScanPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.d("BeaconScanPlugin", "Executing!");
        if (action.equals("startService")) {
            //String message = args.getString(0);
            this.startService();
            return true;
        }
        else if(action.equals("stopService")) {
            this.stopService();
            return true;
        }
        return false;
    }

    private void startService(){
        Log.d("BeaconScanPlugin", "Starting background beacon service");
    }

    private void stopService(){
        Log.d("BeaconScanPlugin", "Stopping background beacon service");
    }
}
