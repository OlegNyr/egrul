package ru.nyrk.generate;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.util.Date;

/**
 * Адаптер для JAXB, переводит xml представление xs:dateTime в java.util.Date и обратно. Формат в xml YYYY-MM-DDThh:mm:ssZ
 */
public class DateTimeAdapter {

    private static final FastDateFormat DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZ");

    public static Date parseDateTime(String dateFromXmlTag) {
        try {
            return DATE_FORMAT.parse(dateFromXmlTag);
        } catch (ParseException e) {
            throw new RuntimeException("Не удалось распарсить дату из xml документа");
        }
    }

    public static String printDateTime(Date date) {
        if (date == null) {
            return null;
        }
        return DATE_FORMAT.format(date);
    }
}
