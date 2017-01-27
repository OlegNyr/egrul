
package ru.nyrk.egrul.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (ru.sbrf.dbofi.server.api.util.adapter.DateAdapter.parseDate(value));
    }

    public String marshal(Date value) {
        return (ru.sbrf.dbofi.server.api.util.adapter.DateAdapter.printDate(value));
    }

}
