
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneCommandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneCommandType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dial"/&gt;
 *     &lt;enumeration value="Hangup"/&gt;
 *     &lt;enumeration value="AllowIgnoreDialing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelephoneCommandType")
@XmlEnum
public enum TelephoneCommandType {

    @XmlEnumValue("Dial")
    DIAL("Dial"),
    @XmlEnumValue("Hangup")
    HANGUP("Hangup"),
    @XmlEnumValue("AllowIgnoreDialing")
    ALLOW_IGNORE_DIALING("AllowIgnoreDialing");
    private final String value;

    TelephoneCommandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneCommandType fromValue(String v) {
        for (TelephoneCommandType c: TelephoneCommandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
