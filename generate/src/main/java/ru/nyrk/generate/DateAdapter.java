package ru.nyrk.generate;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.util.Date;

/**
 * Адаптер для JAXB, переводит xml представление xs:dateError в java.util.Date и обратно. Формат в xml CCYY-MM-DD
 */
public class DateAdapter {

    private static final FastDateFormat DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd");

    public static Date parseDate(String dateFromXmlTag) {
        try {
            return DATE_FORMAT.parse(dateFromXmlTag);
        } catch (ParseException e) {
            throw new RuntimeException("Не удалось распарсить дату из xml документа");
        }
    }

    public static String printDate(Date date) {
        if (date == null) {
            return null;
        }
        return DATE_FORMAT.format(date);
    }
}
