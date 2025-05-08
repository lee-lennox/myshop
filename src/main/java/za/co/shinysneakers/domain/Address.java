package za.co.shinysneakers.domain;

public class Address {
    protected  long addressId;
    protected short streetNumber;
    protected String streetName;
    protected String suburb;
    protected String city;
    protected String province;
    protected short postalCode;

    public Address(long addressId, String streetName, short streetNumber, String suburb, String city, String province, short postalCode) {
        this.addressId = addressId;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.suburb = suburb;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public long getAddressId() {
        return addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public short getStreetNumber() {
        return streetNumber;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public short getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
