package me.tatiyanupanwong.supasin.android.libraries.kits.places.internal.huawei.model;

import androidx.annotation.NonNull;

import me.tatiyanupanwong.supasin.android.libraries.kits.places.model.AddressDetail;

public class HuaweiAddressDetail implements AddressDetail {

    private final @NonNull
    com.huawei.hms.site.api.model.AddressDetail mDelegate;

    HuaweiAddressDetail(@NonNull com.huawei.hms.site.api.model.AddressDetail delegate) {
        mDelegate = delegate;
    }

    @Override
    public String getAdminArea() {
        return mDelegate.getAdminArea();
    }

    @Override
    public String getCountry() {
        return mDelegate.getCountry();
    }

    @Override
    public String getCountryCode() {
        return mDelegate.getCountryCode();
    }

    @Override
    public String getLocality() {
        return mDelegate.getLocality();
    }

    @Override
    public String getPostalCode() {
        return mDelegate.getPostalCode();
    }

    @Override
    public String getStreetNumber() {
        return mDelegate.getStreetNumber();
    }

    @Override
    public String getSubAdminArea() {
        return mDelegate.getSubAdminArea();
    }

    @Override
    public String getSubLocality() {
        return mDelegate.getSubLocality();
    }

    @Override
    public String getTertiaryAdminArea() {
        return mDelegate.getTertiaryAdminArea();
    }

    @Override
    public String getThoroughfare() {
        return mDelegate.getThoroughfare();
    }

    @Override
    public void setAdminArea(String adminArea) {
        mDelegate.setAdminArea(adminArea);
    }

    @Override
    public void setCountry(String country) {
        mDelegate.setCountry(country);
    }

    @Override
    public void setCountryCode(String countryCode) {
        mDelegate.setCountryCode(countryCode);
    }

    @Override
    public void setLocality(String locality) {
        mDelegate.setLocality(locality);
    }

    @Override
    public void setPostalCode(String postalCode) {
        mDelegate.setPostalCode(postalCode);
    }

    @Override
    public void setStreetNumber(String streetNumber) {
        mDelegate.setStreetNumber(streetNumber);
    }

    @Override
    public void setSubAdminArea(String subAdminArea) {
        mDelegate.setSubAdminArea(subAdminArea);
    }

    @Override
    public void setSubLocality(String subLocality) {
        mDelegate.setSubLocality(subLocality);
    }

    @Override
    public void setTertiaryAdminArea(String tertiaryAdminArea) {
        mDelegate.setTertiaryAdminArea(tertiaryAdminArea);
    }

    @Override
    public void setThoroughfare(String thoroughfare) {
        mDelegate.setThoroughfare(thoroughfare);
    }
}
