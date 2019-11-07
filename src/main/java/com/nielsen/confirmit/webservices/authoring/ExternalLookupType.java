
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalLookupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalLookupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hierarchy"/&gt;
 *     &lt;enumeration value="TableLookup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalLookupType")
@XmlEnum
public enum ExternalLookupType {

    @XmlEnumValue("Hierarchy")
    HIERARCHY("Hierarchy"),
    @XmlEnumValue("TableLookup")
    TABLE_LOOKUP("TableLookup");
    private final String value;

    ExternalLookupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalLookupType fromValue(String v) {
        for (ExternalLookupType c: ExternalLookupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
