
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraverseOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TraverseOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InOrder"/&gt;
 *     &lt;enumeration value="Randomize"/&gt;
 *     &lt;enumeration value="Rotate"/&gt;
 *     &lt;enumeration value="Alphabetic"/&gt;
 *     &lt;enumeration value="Flip"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TraverseOrderType")
@XmlEnum
public enum TraverseOrderType {

    @XmlEnumValue("InOrder")
    IN_ORDER("InOrder"),
    @XmlEnumValue("Randomize")
    RANDOMIZE("Randomize"),
    @XmlEnumValue("Rotate")
    ROTATE("Rotate"),
    @XmlEnumValue("Alphabetic")
    ALPHABETIC("Alphabetic"),
    @XmlEnumValue("Flip")
    FLIP("Flip");
    private final String value;

    TraverseOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraverseOrderType fromValue(String v) {
        for (TraverseOrderType c: TraverseOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
