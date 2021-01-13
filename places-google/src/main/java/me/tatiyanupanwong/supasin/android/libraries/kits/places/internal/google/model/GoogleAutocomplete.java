package me.tatiyanupanwong.supasin.android.libraries.kits.places.internal.google.model;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.Arrays;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Autocomplete;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Status;

public class GoogleAutocomplete implements Autocomplete {

    private final @NonNull com.google.android.libraries.places.widget.Autocomplete.IntentBuilder mDelegate;

    public GoogleAutocomplete() {
        this.mDelegate = new com.google.android.libraries.places.widget.Autocomplete.IntentBuilder(AutocompleteActivityMode.FULLSCREEN,
                Arrays.asList(Place.Field.ID, Place.Field.LAT_LNG, Place.Field.NAME, Place.Field.ADDRESS, Place.Field.ADDRESS_COMPONENTS));
    }

    @Override
    public void setQuery(String query) {
        mDelegate.setInitialQuery(query);
    }

    @Override
    public void setCountryCode(String countryCode) {
        mDelegate.setCountry(countryCode);
    }

    @Override
    public Intent getIntent(Activity activity) {
        return mDelegate.build(activity);
    }

    @Override
    public me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Place getPlaceFromIntent(Intent intent) {
        try {
            Place place =  com.google.android.libraries.places.widget.Autocomplete.getPlaceFromIntent(intent);
            return GooglePlace.wrap(place);
        } catch (Exception e) {
            Log.e("GoogleAutocomplete", e.toString());
            return null;
        }
    }

    @Override
    public Status getStatusFromIntent(Intent intent) {
        try {
            com.google.android.gms.common.api.Status status = com.google.android.libraries.places.widget.Autocomplete.getStatusFromIntent(intent);
            return new Status(status.getStatusMessage());
        } catch (Exception e) {
            Log.e("GoogleAutocomplete", e.toString());
            return null;
        }
    }
}
