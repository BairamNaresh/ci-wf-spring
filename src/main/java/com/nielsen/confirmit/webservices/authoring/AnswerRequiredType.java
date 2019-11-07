
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerRequiredType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnswerRequiredType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Blank"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="NotRequired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnswerRequiredType")
@XmlEnum
public enum AnswerRequiredType {

    @XmlEnumValue("Blank")
    BLANK("Blank"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("NotRequired")
    NOT_REQUIRED("NotRequired");
    private final String value;

    AnswerRequiredType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnswerRequiredType fromValue(String v) {
        for (AnswerRequiredType c: AnswerRequiredType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
