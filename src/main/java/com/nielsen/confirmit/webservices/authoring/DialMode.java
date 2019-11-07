
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DialMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DialMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSpecified"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Preview"/&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *     &lt;enumeration value="Predictive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DialMode")
@XmlEnum
public enum DialMode {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Preview")
    PREVIEW("Preview"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Predictive")
    PREDICTIVE("Predictive");
    private final String value;

    DialMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DialMode fromValue(String v) {
        for (DialMode c: DialMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
