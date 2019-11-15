
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariableType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Bool"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Byte"/&gt;
 *     &lt;enumeration value="Short"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="Long"/&gt;
 *     &lt;enumeration value="Numeric"/&gt;
 *     &lt;enumeration value="Guid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VariableType")
@XmlEnum
public enum VariableType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Bool")
    BOOL("Bool"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Byte")
    BYTE("Byte"),
    @XmlEnumValue("Short")
    SHORT("Short"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Guid")
    GUID("Guid");
    private final String value;

    VariableType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariableType fromValue(String v) {
        for (VariableType c: VariableType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
