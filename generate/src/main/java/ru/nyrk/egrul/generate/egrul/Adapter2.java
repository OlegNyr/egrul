
package ru.nyrk.egrul.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (ru.nyrk.egrul.generate.DateAdapter.parseDate(value));
    }

    public String marshal(Date value) {
        return (ru.nyrk.egrul.generate.DateAdapter.printDate(value));
    }

}
