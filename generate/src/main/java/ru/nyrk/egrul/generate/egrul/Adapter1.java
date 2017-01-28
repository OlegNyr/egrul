
package ru.nyrk.egrul.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (ru.nyrk.egrul.generate.DateTimeAdapter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (ru.nyrk.egrul.generate.DateTimeAdapter.printDateTime(value));
    }

}
