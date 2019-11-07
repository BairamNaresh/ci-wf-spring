
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StopDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Screened"/&gt;
 *     &lt;enumeration value="QuotaFull"/&gt;
 *     &lt;enumeration value="NoChange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopDataType")
@XmlEnum
public enum StopDataType {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Screened")
    SCREENED("Screened"),
    @XmlEnumValue("QuotaFull")
    QUOTA_FULL("QuotaFull"),
    @XmlEnumValue("NoChange")
    NO_CHANGE("NoChange");
    private final String value;

    StopDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopDataType fromValue(String v) {
        for (StopDataType c: StopDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
