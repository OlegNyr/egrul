package ru.nyrk.egrul.loader.impl;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.legal.HistoryRecord;
import ru.nyrk.egrul.database.entity.legal.HistoryRecordDocument;
import ru.nyrk.generate.egrul.DocInfoRecordEGRULType;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * ПОлучает структуру
 */
@Service
public class EgrulHistoryServiceHelper {

    public Set<HistoryRecord> makeHistoryRecord(List<DocInfoRecordEGRULType> docInfoRecordEGRUL) {
        Set<HistoryRecord> historyRecords = Sets.newHashSet();
        for (DocInfoRecordEGRULType ddd : docInfoRecordEGRUL) {
            HistoryRecord historyRecord = new HistoryRecord();
            historyRecord.setGrn(ddd.getГРН());
            historyRecord.setDateRecord(ddd.getДатаЗап());
            historyRecord.setVidRecord(ddd.getВидЗап().getKodSPVZ());
            historyRecord.setNameRecord(ddd.getВидЗап().getNameVidRecord());
            historyRecord.setHaveRecord(ddd.getСвРегОрг().getInfoRegOrgan());

            Set<HistoryRecordDocument> historyRecordDocuments =
                    ddd.getСведПредДок()
                            .stream()
                            .map(s -> new HistoryRecordDocument(s.getДатаДок(), s.getНаимДок(), s.getНомДок()))
                            .collect(Collectors.toSet());
            historyRecord.setHistoryRecordDocuments(historyRecordDocuments);

            historyRecords.add(historyRecord);
        }
        return historyRecords;
    }

}
