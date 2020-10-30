package me.tatiyanupanwong.supasin.android.libraries.kits.places.internal.google.model;

import android.app.Activity;
import android.content.Intent;
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
                Arrays.asList(Place.Field.ID, Place.Field.LAT_LNG, Place.Field.NAME));
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
        Place place =  com.google.android.libraries.places.widget.Autocomplete.getPlaceFromIntent(intent);
        return GooglePlace.wrap(place);
    }

    @Override
    public Status getStatusFromIntent(Intent intent) {
        com.google.android.gms.common.api.Status status = com.google.android.libraries.places.widget.Autocomplete.getStatusFromIntent(intent);
        return new Status(status.getStatusMessage());
    }
}
