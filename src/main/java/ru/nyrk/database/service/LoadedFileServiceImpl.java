package ru.nyrk.database.service;

import com.google.common.collect.ImmutableMap;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import ru.nyrk.database.entity.ArchiveFile;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

@org.springframework.stereotype.Service
public class LoadedFileServiceImpl extends GenericService<ArchiveFile> implements LoadedFileService {

    @Autowired
    public LoadedFileServiceImpl(Session session) {
        super(session);
    }

    @Override
    Class<ArchiveFile> getEntityType() {
        return ArchiveFile.class;
    }

    @Override
    public ArchiveFile lastLoadedFileCorrect() {
        Iterable<ArchiveFile> archiveFiles = session.query(ArchiveFile.class,
                "MATCH (a:ArchiveFile {status:\"COMPLETE\"})\n" +
                        "WITH a, max(a.dateFile) as max\n" +
                        "where a.dateFile = max\n" +
                        "RETURN a", Collections.emptyMap());
        return archiveFiles.iterator().hasNext() ? archiveFiles.iterator().next() : null;
    }

    @Override
    public ArchiveFile findLoadedFileByDateFileAndFileId(Date dateFile, Integer fileId) {
        Iterator<ArchiveFile> iterator = session.query(ArchiveFile.class,
                "MATCH (a:ArchiveFile {dateFile:$dateFile, fileId:$fileId}) RETURN a",
                ImmutableMap.of("dateFile", dateFile, "fileId", fileId)).iterator();
        return iterator.hasNext() ? iterator.next() : null;
    }
}
