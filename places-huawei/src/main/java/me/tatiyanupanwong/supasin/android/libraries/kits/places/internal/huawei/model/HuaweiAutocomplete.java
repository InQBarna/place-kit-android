package me.tatiyanupanwong.supasin.android.libraries.kits.places.internal.huawei.model;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;

import com.huawei.hms.site.api.model.SearchStatus;
import com.huawei.hms.site.widget.SearchFilter;
import com.huawei.hms.site.widget.SearchIntent;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Autocomplete;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Place;
import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.Status;

public class HuaweiAutocomplete implements Autocomplete {

    private final @NonNull SearchIntent mDelegate;
    private SearchFilter searchFilter;

    public HuaweiAutocomplete(String apiKey) {
        this.mDelegate = new SearchIntent();
        this.searchFilter = new SearchFilter();
        this.mDelegate.setApiKey(apiKey);
    }

    @Override
    public void setQuery(String query) {
        searchFilter.setQuery(query);
    }

    @Override
    public void setCountryCode(String countryCode) {
        searchFilter.setCountryCode(countryCode);
    }

    @Override
    public Intent getIntent(Activity activity) {
        mDelegate.setSearchFilter(searchFilter);
        return mDelegate.getIntent(activity);
    }

    @Override
    public Place getPlaceFromIntent(Intent intent) {
        try {
            return HuaweiPlace.wrap(mDelegate.getSiteFromIntent(intent));
        } catch (Exception e) {
            Log.e("HuaweiAutocomplete", e.toString());
            return null;
        }
    }

    @Override
    public Status getStatusFromIntent(Intent intent) {
        try {
            SearchStatus searchStatus = mDelegate.getStatusFromIntent(intent);
            return new Status(searchStatus.errorMessage);
        } catch (Exception e) {
            Log.e("HuaweiAutocomplete", e.toString());
            return null;
        }
    }
}
