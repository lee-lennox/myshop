package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.util.Helper;

public class FlatFactory {
    public static Flat validateStringAttribbutesAndCreateHouse(String flatName,
                                                               String streetName,
                                                               String suburb,
                                                               String city,
                                                               String province
    ){
        if(
                Helper.isNullOrEmpty(flatName)
                &&Helper.isNullOrEmpty(streetName)
                &&Helper.isNullOrEmpty(suburb)
                &&Helper.isNullOrEmpty(city)
                &&Helper.isNullOrEmpty(province)) {
            ;
            return null;
        }
        return new Flat.Builder()
                .setFlatName(flatName)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .build();
    }
    public static Flat validtePostalCode(short postalCode){
        if(Helper.isValidPostalCode(postalCode)){
            return null;
        }
        return new Flat.Builder()
                .setPostalCode(postalCode)
                .build();
    }
    public static Flat validateStretNumbuber(short streetNumber){
        if(Helper.isValidStreetNumber(streetNumber)){
            return null;
        }
        return new Flat.Builder()
                .setStreetNumber(streetNumber)
                .build();
    }
}
