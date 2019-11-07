
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerButtonsMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnswerButtonsMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inherit"/&gt;
 *     &lt;enumeration value="On"/&gt;
 *     &lt;enumeration value="Off"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnswerButtonsMode")
@XmlEnum
public enum AnswerButtonsMode {

    @XmlEnumValue("Inherit")
    INHERIT("Inherit"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    AnswerButtonsMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnswerButtonsMode fromValue(String v) {
        for (AnswerButtonsMode c: AnswerButtonsMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
