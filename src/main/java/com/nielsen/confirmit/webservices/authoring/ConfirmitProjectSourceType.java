
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmitProjectSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfirmitProjectSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Authoring"/&gt;
 *     &lt;enumeration value="DataProcessing"/&gt;
 *     &lt;enumeration value="Express"/&gt;
 *     &lt;enumeration value="Poll"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfirmitProjectSourceType")
@XmlEnum
public enum ConfirmitProjectSourceType {

    @XmlEnumValue("Authoring")
    AUTHORING("Authoring"),
    @XmlEnumValue("DataProcessing")
    DATA_PROCESSING("DataProcessing"),
    @XmlEnumValue("Express")
    EXPRESS("Express"),
    @XmlEnumValue("Poll")
    POLL("Poll");
    private final String value;

    ConfirmitProjectSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfirmitProjectSourceType fromValue(String v) {
        for (ConfirmitProjectSourceType c: ConfirmitProjectSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
