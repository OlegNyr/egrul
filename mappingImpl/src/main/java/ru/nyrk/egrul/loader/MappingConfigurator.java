package ru.nyrk.egrul.loader;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import ru.nyrk.egrul.loader.impl.ParseArchiveImpl;
import ru.nyrk.generate.egrul.EGRUL;

@Configuration
@ComponentScan(basePackageClasses = ParseArchiveImpl.class)
public class MappingConfigurator {
    @Bean
    public Jaxb2Marshaller jaxb2MarshallerEGRUL() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(EGRUL.class);
        return marshaller;
    }

    @Bean
    public JsonParser jsonParser() {
        return JsonParserFactory.getJsonParser();
    }

}
