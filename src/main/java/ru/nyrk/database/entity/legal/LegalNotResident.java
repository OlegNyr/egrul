package ru.nyrk.database.entity.legal;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

import java.util.Date;

@Data
@NodeEntity
@Builder
public class LegalNotResident {
    private String fullName;
    private String OKSM;
    private String country;
    @DateLong
    private Date regDate;
    private String regNumb;
    private String regName;
    private String address;

    public LegalNotResident() {
    }
}
