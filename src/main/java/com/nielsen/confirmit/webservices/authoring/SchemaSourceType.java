
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchemaSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SchemaSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Design"/&gt;
 *     &lt;enumeration value="RuntimeTest"/&gt;
 *     &lt;enumeration value="RuntimeProduction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SchemaSourceType")
@XmlEnum
public enum SchemaSourceType {

    @XmlEnumValue("Design")
    DESIGN("Design"),
    @XmlEnumValue("RuntimeTest")
    RUNTIME_TEST("RuntimeTest"),
    @XmlEnumValue("RuntimeProduction")
    RUNTIME_PRODUCTION("RuntimeProduction");
    private final String value;

    SchemaSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchemaSourceType fromValue(String v) {
        for (SchemaSourceType c: SchemaSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
