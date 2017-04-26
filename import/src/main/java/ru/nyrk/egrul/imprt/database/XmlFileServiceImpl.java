package ru.nyrk.egrul.imprt.database;

import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.egrul.imprt.repo.XmlFileRepository;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class XmlFileServiceImpl extends GenericService<XmlFile, XmlFileRepository> implements XmlFileService {
    private AtomicLong sequenceXmlFile;

    public XmlFileServiceImpl(XmlFileRepository repository) {
        super(repository);
    }

    @PostConstruct
    void init() {
        sequenceXmlFile = new AtomicLong(repository.count());
        sequenceXmlFile.incrementAndGet();
    }

    @Override
    public XmlFile createOrUpdate(XmlFile object) {
        if (object.getId() == null) {
            object.setId(sequenceXmlFile.getAndIncrement());
        }
        return super.createOrUpdate(object);
    }
}
