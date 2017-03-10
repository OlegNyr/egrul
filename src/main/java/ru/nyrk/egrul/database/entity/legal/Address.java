package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;

/**
 * Адреса
 */
@Data
@NodeEntity
@EqualsAndHashCode(callSuper = true)
public class Address extends GRNDate {
    private String kladr;
    private String regionCode;
    private String treet;
    private String regionType;
    private String regionName;

    private String districtType;
    private String districtName;
    private String cityType;
    private String cityName;
    private String localityType;
    private String localityName;
    private String streetType;
    private String streetName;
    private String pIndex;


    private String house;
    private String korpus;
    private String kwartira;

    public Address() {
    }


    public static final class AddressBuilder {
        private String kladr;
        private String regionCode;
        private String treet;
        private String regionType;
        private String regionName;
        private Date dateRecord;
        private String districtType;
        private String grn;
        private String districtName;
        private String cityType;
        private String cityName;
        private String localityType;
        private String localityName;
        private String streetType;
        private String streetName;
        private String pIndex;
        private String house;
        private String korpus;
        private String kwartira;

        private AddressBuilder() {
        }

        public static AddressBuilder anAddress() {
            return new AddressBuilder();
        }

        public AddressBuilder withKladr(String kladr) {
            this.kladr = kladr;
            return this;
        }

        public AddressBuilder withRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }

        public AddressBuilder withTreet(String treet) {
            this.treet = treet;
            return this;
        }

        public AddressBuilder withRegionType(String regionType) {
            this.regionType = regionType;
            return this;
        }

        public AddressBuilder withRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }

        public AddressBuilder withDateRecord(Date dateRecord) {
            this.dateRecord = dateRecord;
            return this;
        }

        public AddressBuilder withDistrictType(String districtType) {
            this.districtType = districtType;
            return this;
        }

        public AddressBuilder withGrn(String grn) {
            this.grn = grn;
            return this;
        }

        public AddressBuilder withDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }

        public AddressBuilder withCityType(String cityType) {
            this.cityType = cityType;
            return this;
        }

        public AddressBuilder withCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public AddressBuilder withLocalityType(String localityType) {
            this.localityType = localityType;
            return this;
        }

        public AddressBuilder withLocalityName(String localityName) {
            this.localityName = localityName;
            return this;
        }

        public AddressBuilder withStreetType(String streetType) {
            this.streetType = streetType;
            return this;
        }

        public AddressBuilder withStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public AddressBuilder withPIndex(String pIndex) {
            this.pIndex = pIndex;
            return this;
        }

        public AddressBuilder withHouse(String house) {
            this.house = house;
            return this;
        }

        public AddressBuilder withKorpus(String korpus) {
            this.korpus = korpus;
            return this;
        }

        public AddressBuilder withKwartira(String kwartira) {
            this.kwartira = kwartira;
            return this;
        }

        public Address build() {
            Address address = new Address();
            address.setKladr(kladr);
            address.setRegionCode(regionCode);
            address.setTreet(treet);
            address.setRegionType(regionType);
            address.setRegionName(regionName);
            address.setDateRecord(dateRecord);
            address.setDistrictType(districtType);
            address.setGrn(grn);
            address.setDistrictName(districtName);
            address.setCityType(cityType);
            address.setCityName(cityName);
            address.setLocalityType(localityType);
            address.setLocalityName(localityName);
            address.setStreetType(streetType);
            address.setStreetName(streetName);
            address.setPIndex(pIndex);
            address.setHouse(house);
            address.setKorpus(korpus);
            address.setKwartira(kwartira);
            return address;
        }
    }
}
