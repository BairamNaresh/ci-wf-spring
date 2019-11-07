
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SssVariableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SssVariableType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="single"/&gt;
 *     &lt;enumeration value="multiple"/&gt;
 *     &lt;enumeration value="quantity"/&gt;
 *     &lt;enumeration value="character"/&gt;
 *     &lt;enumeration value="logical"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SssVariableType")
@XmlEnum
public enum SssVariableType {

    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("multiple")
    MULTIPLE("multiple"),
    @XmlEnumValue("quantity")
    QUANTITY("quantity"),
    @XmlEnumValue("character")
    CHARACTER("character"),
    @XmlEnumValue("logical")
    LOGICAL("logical"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("time")
    TIME("time");
    private final String value;

    SssVariableType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SssVariableType fromValue(String v) {
        for (SssVariableType c: SssVariableType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
