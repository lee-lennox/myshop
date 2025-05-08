package za.co.shinysneakers.domain;

public class Flat extends Address{
    protected short uniNumber;
    protected String flatName;


    protected Flat(long addressId, String streetName, short streetNumber, String suburb,
                String city, String province, short postalCode) {
        super(addressId, streetName, streetNumber, suburb, city, province, postalCode);
    }

    protected Flat(long addressId, String streetName, short streetNumber, String suburb, String city, String province, short postalCode, short uniNumber, String flatName) {
        super(addressId, streetName, streetNumber, suburb, city, province, postalCode);
        this.uniNumber = uniNumber;
        this.flatName = flatName;
    }

    protected Flat(Builder builder) {
        super(builder.build().addressId, builder.streetName,builder.streetNumber,
                builder.suburb,builder.city,
                builder.province,builder.postalCode);
    }

    public short getUniNumber() {
        return uniNumber;
    }

    public String getFlatName() {
        return flatName;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "uniNumber=" + uniNumber +
                ", flatName='" + flatName + '\'' +
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
        protected short uniNumber;
        protected String streetName;
        protected String flatName;
        protected short streetNumber;
        protected String suburb;
        protected String city;
        protected String province;
        protected short postalCode;

        public Builder setUniNumber(short uniNumber) {
            this.uniNumber = uniNumber;
            return this;
        }

        public Builder setFlatName(String flatName) {
            this.flatName = flatName;
            return this;
        }
        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setStreetNumber(short streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostalCode(short postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder copy(Flat flat) {
            this.uniNumber = flat.uniNumber;
            this.flatName = flat.flatName;
            this.streetName=flat.streetName;
            this.streetNumber = flat.streetNumber;
            this.suburb = flat.suburb;
            this.city = flat.city;
            this.province = flat.province;
            this.postalCode = flat.postalCode;

            return this;

        }
        public Flat build() {
            return new Flat(this);
        }
    }
}
