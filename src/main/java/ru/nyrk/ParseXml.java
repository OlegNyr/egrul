package ru.nyrk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;

/**
 * todo:java doc
 */
@Service
public class ParseXml implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
//        JAXBContext jc = JAXBContext.newInstance(FosterHome.class);
//
//        Unmarshaller unmarshaller = jc.createUnmarshaller();
//        FosterHome fosterHome = (FosterHome) unmarshaller.unmarshal(new File("src/nov18/input.xml"));
//
//        Marshaller marshaller = jc.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(fosterHome, System.out);
    }
}
