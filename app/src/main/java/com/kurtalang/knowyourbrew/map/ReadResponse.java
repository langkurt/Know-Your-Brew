package com.kurtalang.knowyourbrew.map;

import com.google.android.gms.maps.GoogleMap;

import java.util.HashMap;
import java.util.List;

/**
 * Created by kurtalang on 11/6/15.
 */
public interface ReadResponse {
    void processFinish(List<HashMap<String, String>> output, GoogleMap googleMap);
}
