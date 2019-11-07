
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnswerListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Hierarchy"/&gt;
 *     &lt;enumeration value="TableLookup"/&gt;
 *     &lt;enumeration value="AutoIncrement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnswerListType")
@XmlEnum
public enum AnswerListType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Hierarchy")
    HIERARCHY("Hierarchy"),
    @XmlEnumValue("TableLookup")
    TABLE_LOOKUP("TableLookup"),
    @XmlEnumValue("AutoIncrement")
    AUTO_INCREMENT("AutoIncrement");
    private final String value;

    AnswerListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnswerListType fromValue(String v) {
        for (AnswerListType c: AnswerListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
