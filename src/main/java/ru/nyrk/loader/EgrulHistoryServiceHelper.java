package ru.nyrk.loader;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import ru.nyrk.database.entity.legal.HistoryRecord;
import ru.nyrk.database.entity.legal.HistoryRecordDocument;
import ru.nyrk.egrul.generate.egrul.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ПОлучает структуру
 */
@Service
public class EgrulHistoryServiceHelper {


    public List<HistoryRecord> makeHistoryRecord(List<DocInfoRecordEGRULType> docInfoRecordEGRUL) {
        List<HistoryRecord> historyRecords = Lists.newArrayList();
        for (DocInfoRecordEGRULType ddd : docInfoRecordEGRUL) {
            HistoryRecord historyRecord = new HistoryRecord();
            historyRecord.setGrn(ddd.getГРН());
            historyRecord.setDateRecord(ddd.getДатаЗап());
            historyRecord.setVidRecord(ddd.getВидЗап().getKodSPVZ());
            historyRecord.setNameRecord(ddd.getВидЗап().getNameVidRecord());
            historyRecord.setHaveRecord(ddd.getСвРегОрг().getInfoRegOrgan());

            List<HistoryRecordDocument> historyRecordDocuments =
                    ddd.getСведПредДок()
                            .stream()
                            .map(s -> new HistoryRecordDocument(s.getДатаДок(), s.getНаимДок(), s.getНомДок()))
                            .collect(Collectors.toList());
            historyRecord.setHistoryRecordDocuments(historyRecordDocuments);
            historyRecords.add(historyRecord);
        }
        return historyRecords;
    }

}
