
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpperLimitDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpperLimitDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Smaller"/&gt;
 *     &lt;enumeration value="SmallerOrEqual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpperLimitDataType")
@XmlEnum
public enum UpperLimitDataType {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Smaller")
    SMALLER("Smaller"),
    @XmlEnumValue("SmallerOrEqual")
    SMALLER_OR_EQUAL("SmallerOrEqual");
    private final String value;

    UpperLimitDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpperLimitDataType fromValue(String v) {
        for (UpperLimitDataType c: UpperLimitDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
