package ru.nyrk.loader;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.database.LegalPartyService;
import ru.nyrk.database.entity.XmlFile;
import ru.nyrk.database.entity.legal.Address;
import ru.nyrk.database.entity.legal.HistoryRecord;
import ru.nyrk.database.entity.legal.LegalParty;
import ru.nyrk.egrul.generate.egrul.*;

import java.util.List;

/**
 * ПОлучает структуру
 */
@Service
public class EgrulHistoryServiceHelper{


    public List<HistoryRecord> makeHistoryRecord(List<DocInfoRecordEGRULType> docInfoRecordEGRUL) {
        List<HistoryRecord> historyRecords = Lists.newArrayList();
        for (DocInfoRecordEGRULType ddd : docInfoRecordEGRUL) {
            HistoryRecord historyRecord = new HistoryRecord();
            historyRecord.setGrn(ddd.getГРН());
            historyRecord.setDateRecord(ddd.getДатаЗап());
            historyRecord.setVidRecord(ddd.getВидЗап().getKodSPVZ());
            historyRecord.setNameRecord(ddd.getВидЗап().getNameVidRecord());
            historyRecord.setHaveRecord(ddd.getСвРегОрг().getInfoRegOrgan());
            historyRecords.add(historyRecord);
        }
        return historyRecords;
    }

}
