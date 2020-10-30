package me.tatiyanupanwong.supasin.android.libraries.kits.places.model;

import android.app.Activity;
import android.content.Intent;

public interface Autocomplete {
    void setQuery(String query);
    void setCountryCode(String countryCode);
    Intent getIntent(Activity activity);
    Place getPlaceFromIntent(Intent intent);
    Status getStatusFromIntent(Intent intent);
}
