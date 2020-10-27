package me.tatiyanupanwong.supasin.android.libraries.kits.places.model;

public interface AddressDetail {
    String getAdminArea();

    String getCountry();

    String getCountryCode();

    String getLocality();

    String getPostalCode();

    String getStreetNumber();

    String getSubAdminArea();

    String getSubLocality();

    String getTertiaryAdminArea();

    String getThoroughfare();

    void setAdminArea(String adminArea);

    void setCountry(String country);

    void setCountryCode(String countryCode);

    void setLocality(String locality);

    void setPostalCode(String postalCode);

    void setStreetNumber(String streetNumber);

    void setSubAdminArea(String subAdminArea);
    
    void setSubLocality(String subLocality);

    void setTertiaryAdminArea(String tertiaryAdminArea);

    void setThoroughfare(String thoroughfare);
}
