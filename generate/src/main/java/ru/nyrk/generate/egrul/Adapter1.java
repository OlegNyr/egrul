
package ru.nyrk.generate.egrul;

import ru.nyrk.generate.DateTimeAdapter;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (DateTimeAdapter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (DateTimeAdapter.printDateTime(value));
    }

}
