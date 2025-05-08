package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.util.Helper;

public class HouseFactcory {
    public static House validateStringAttribbutesAndCreateHouse(String streetName,
                                                                 String suburb,
                                                                 String city,
                                                                 String province
                                                                 ){
        if(Helper.isNullOrEmpty(streetName)
                &&Helper.isNullOrEmpty(suburb)
                &&Helper.isNullOrEmpty(city)
                &&Helper.isNullOrEmpty(province)) {
            ;
            return null;
        }
        return new House.Builder()
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .build();
    }

    public static House validtePostalCode(short postalCode){
        if(Helper.isValidPostalCode(postalCode)){
            return null;
        }
        return new House.Builder()
                .setPostalCode(postalCode)
                .build();
    }
}
