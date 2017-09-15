package com.example.mapcurrentlocation;

import android.app.Activity;
import android.content.SharedPreferences;

public class LocationPreference {

    SharedPreferences prefs;

    public LocationPreference (Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    Double[] getLatLong(){
        Double[] res = new Double[2];
        res[0] = Double.valueOf(prefs.getString("latitude", "0.0"));
        res[1] = Double.valueOf(prefs.getString("longitude", "0.0"));

        return res;
    }

    void setLatLong(double lat, double lon){
        prefs.edit().putString("latitude", String.valueOf(lat)).commit();
        prefs.edit().putString("longitude", String.valueOf(lon)).commit();
    }

}
