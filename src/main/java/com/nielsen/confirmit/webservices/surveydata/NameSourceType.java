
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Title"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameSourceType")
@XmlEnum
public enum NameSourceType {

    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    NameSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameSourceType fromValue(String v) {
        for (NameSourceType c: NameSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
