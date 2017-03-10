
package ru.nyrk.generate.egrul;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GRNDate
    extends JAXBElement<GRNDateType>
{

    protected final static QName NAME = new QName("", "\u0413\u0420\u041d\u0414\u0430\u0442\u0430");

    public GRNDate(GRNDateType value) {
        super(NAME, ((Class) GRNDateType.class), null, value);
    }

    public GRNDate() {
        super(NAME, ((Class) GRNDateType.class), null, null);
    }

}
