
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatabaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Production"/&gt;
 *     &lt;enumeration value="Test"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DatabaseType")
@XmlEnum
public enum DatabaseType {

    @XmlEnumValue("Production")
    PRODUCTION("Production"),
    @XmlEnumValue("Test")
    TEST("Test");
    private final String value;

    DatabaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatabaseType fromValue(String v) {
        for (DatabaseType c: DatabaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
