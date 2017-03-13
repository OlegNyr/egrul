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

    private Address(Builder builder) {
        setKladr(builder.kladr);
        setRegionCode(builder.regionCode);
        setTreet(builder.treet);
        setRegionType(builder.regionType);
        setRegionName(builder.regionName);
        setDistrictType(builder.districtType);
        setDistrictName(builder.districtName);
        setCityType(builder.cityType);
        setCityName(builder.cityName);
        setLocalityType(builder.localityType);
        setLocalityName(builder.localityName);
        setStreetType(builder.streetType);
        setStreetName(builder.streetName);
        pIndex = builder.pIndex;
        setHouse(builder.house);
        setKorpus(builder.korpus);
        setKwartira(builder.kwartira);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Address copy) {
        Builder builder = new Builder();
        builder.kladr = copy.kladr;
        builder.regionCode = copy.regionCode;
        builder.treet = copy.treet;
        builder.regionType = copy.regionType;
        builder.regionName = copy.regionName;
        builder.districtType = copy.districtType;
        builder.districtName = copy.districtName;
        builder.cityType = copy.cityType;
        builder.cityName = copy.cityName;
        builder.localityType = copy.localityType;
        builder.localityName = copy.localityName;
        builder.streetType = copy.streetType;
        builder.streetName = copy.streetName;
        builder.pIndex = copy.pIndex;
        builder.house = copy.house;
        builder.korpus = copy.korpus;
        builder.kwartira = copy.kwartira;
        return builder;
    }


    public static final class Builder {
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

        private Builder() {
        }

        public Builder withKladr(String val) {
            kladr = val;
            return this;
        }

        public Builder withRegionCode(String val) {
            regionCode = val;
            return this;
        }

        public Builder withTreet(String val) {
            treet = val;
            return this;
        }

        public Builder withRegionType(String val) {
            regionType = val;
            return this;
        }

        public Builder withRegionName(String val) {
            regionName = val;
            return this;
        }

        public Builder withDistrictType(String val) {
            districtType = val;
            return this;
        }

        public Builder withDistrictName(String val) {
            districtName = val;
            return this;
        }

        public Builder withCityType(String val) {
            cityType = val;
            return this;
        }

        public Builder withCityName(String val) {
            cityName = val;
            return this;
        }

        public Builder withLocalityType(String val) {
            localityType = val;
            return this;
        }

        public Builder withLocalityName(String val) {
            localityName = val;
            return this;
        }

        public Builder withStreetType(String val) {
            streetType = val;
            return this;
        }

        public Builder withStreetName(String val) {
            streetName = val;
            return this;
        }

        public Builder withPIndex(String val) {
            pIndex = val;
            return this;
        }

        public Builder withHouse(String val) {
            house = val;
            return this;
        }

        public Builder withKorpus(String val) {
            korpus = val;
            return this;
        }

        public Builder withKwartira(String val) {
            kwartira = val;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
