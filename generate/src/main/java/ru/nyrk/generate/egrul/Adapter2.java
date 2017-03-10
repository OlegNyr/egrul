
package ru.nyrk.generate.egrul;

import ru.nyrk.generate.DateAdapter;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (DateAdapter.parseDate(value));
    }

    public String marshal(Date value) {
        return (DateAdapter.printDate(value));
    }

}
