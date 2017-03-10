package ru.nyrk.egrul;

import org.springframework.stereotype.Service;
import ru.nyrk.generate.egrul.EGRUL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * todo:java doc
 */
@Service
public class ParseXml  {
//    @Override
    public void run(String... args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(EGRUL.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        EGRUL fosterHome = (EGRUL) unmarshaller.unmarshal(new File("/work/trc/egrul/data/EGRUL_FULL_2017-01-01_189221.XML"));

    }
}
