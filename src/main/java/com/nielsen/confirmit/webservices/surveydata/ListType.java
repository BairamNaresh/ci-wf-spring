
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fields"/&gt;
 *     &lt;enumeration value="Answers"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListType")
@XmlEnum
public enum ListType {

    @XmlEnumValue("Fields")
    FIELDS("Fields"),
    @XmlEnumValue("Answers")
    ANSWERS("Answers");
    private final String value;

    ListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListType fromValue(String v) {
        for (ListType c: ListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
