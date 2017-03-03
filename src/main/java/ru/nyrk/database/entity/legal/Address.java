package ru.nyrk.database.entity.legal;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.database.entity.Entity;

/**
 * Адреса
 */
@Data
@Builder
@NodeEntity
public class Address extends GRNDate {
    String kladr;
    String regionCode;
    String treet;
    String regionType;
    String regionName;

    String districtType;
    String districtName;
    String cityType;
    String cityName;
    String localityType;
    String localityName;
    String streetType;
    String streetName;
    String pIndex;


    String house;
    String korpus;
    String kwartira;

    public Address() {
    }
}
