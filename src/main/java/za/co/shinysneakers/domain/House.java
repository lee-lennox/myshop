package za.co.shinysneakers.domain;

public class House extends Address{
    protected int erfNumber;

    public House(long addressId, String streetName, short streetNumber, String suburb, String city, String province, short postalCode, int erfNumber) {
        super(addressId, streetName, streetNumber, suburb, city, province, postalCode);
        this.erfNumber = erfNumber;
    }

//    public House(long addressId, String streetName, short streetNumber, String suburb, String city, String province, short postalCode) {
//        super(addressId, streetName, streetNumber, suburb, city, province, postalCode);
//    }

    public House(Builder builder) {
        super(builder.addressId, builder.streetName,
                builder.streetNumber,builder.suburb,
                builder.city,builder.province, builder.postalCode);
    }


    public int getErfNumber() {
        return erfNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "erfNumber=" + erfNumber +
                ", addressId=" + addressId +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public static class Builder {
        protected long addressId;
        protected String streetName;
        protected short streetNumber;
        protected String suburb;
        protected String city;
        protected String province;
        protected short postalCode;
        protected int erfNumber;

        public Builder setAddressId(long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setPostalCode(short postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setStreetNumber(short streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setErfNumber(int erfNumber) {
            this.erfNumber = erfNumber;
            return this;
        }

        public Builder copy(House house) {
            this.addressId = house.addressId;
            this.streetName = house.streetName;
            this.streetNumber = house.streetNumber;
            this.suburb = house.suburb;
            this.city = house.city;
            this.province = house.province;
            this.postalCode = house.postalCode;
            this.erfNumber = house.erfNumber;
            return this;
        }
        public House build() {
            return new House(this);
        }
    }

}
