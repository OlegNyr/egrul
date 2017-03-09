package ru.nyrk.database.entity.legal;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.database.entity.Entity;

/**
 * Учередители компании
 */
@Data
@NodeEntity
public class OwnerCompany extends Entity{
    NaturalPerson naturalPerson;
    LegalParty legalParty;
    LegalNotResident legalPartyNotResident;
    String proportion;
}
