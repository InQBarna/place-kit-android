package me.tatiyanupanwong.supasin.android.libraries.kits.places.internal.google.model;

import androidx.annotation.NonNull;

import com.google.android.libraries.places.api.model.AddressComponent;

import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.AddressDetail;

public class GoogleAddressDetail implements AddressDetail {

    private final @NonNull
    com.google.android.libraries.places.api.model.AddressComponents mDelegate;

    GoogleAddressDetail(@NonNull com.google.android.libraries.places.api.model.AddressComponents delegate) {
        mDelegate = delegate;
    }

    @Override
    public String getAdminArea() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("administrative_area_level_1")) return c.getName();
        }
        return null;
    }

    @Override
    public String getCountry() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("country")) return c.getName();
        }
        return null;
    }

    @Override
    public String getCountryCode() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("country")) return c.getShortName();
        }
        return null;
    }

    @Override
    public String getLocality() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("locality")) return c.getName();
        }
        return null;
    }

    @Override
    public String getPostalCode() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("postal_code")) return c.getName();
        }
        return null;
    }

    @Override
    public String getStreetNumber() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("street_number")) return c.getName();
        }
        return null;
    }

    @Override
    public String getSubAdminArea() {
        //TODO What's the equivalent
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("locality")) return c.getName();
        }
        return null;
    }

    @Override
    public String getSubLocality() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("sublocality")) return c.getName();
        }
        return null;
    }

    @Override
    public String getTertiaryAdminArea() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("administrative_area_level_3")) return c.getName();
        }
        return null;
    }

    @Override
    public String getThoroughfare() {
        for (AddressComponent c: mDelegate.asList()) {
            if (c.getTypes().contains("route")) return c.getName();
        }
        return null;
    }

    @Override
    public void setAdminArea(String adminArea) {

    }

    @Override
    public void setCountry(String country) {

    }

    @Override
    public void setCountryCode(String countryCode) {

    }

    @Override
    public void setLocality(String locality) {

    }

    @Override
    public void setPostalCode(String postalCode) {

    }

    @Override
    public void setStreetNumber(String streetNumber) {

    }

    @Override
    public void setSubAdminArea(String subAdminArea) {

    }

    @Override
    public void setSubLocality(String subLocality) {

    }

    @Override
    public void setTertiaryAdminArea(String tertiaryAdminArea) {

    }

    @Override
    public void setThoroughfare(String thoroughfare) {

    }
}
