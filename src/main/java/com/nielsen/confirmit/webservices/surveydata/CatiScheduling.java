
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatiScheduling.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CatiScheduling"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CatiScheduling")
@XmlEnum
public enum CatiScheduling {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Simple")
    SIMPLE("Simple");
    private final String value;

    CatiScheduling(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CatiScheduling fromValue(String v) {
        for (CatiScheduling c: CatiScheduling.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
