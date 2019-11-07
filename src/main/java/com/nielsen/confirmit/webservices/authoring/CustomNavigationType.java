
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomNavigationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomNavigationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Button"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomNavigationType")
@XmlEnum
public enum CustomNavigationType {

    @XmlEnumValue("Button")
    BUTTON("Button"),
    @XmlEnumValue("Image")
    IMAGE("Image");
    private final String value;

    CustomNavigationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomNavigationType fromValue(String v) {
        for (CustomNavigationType c: CustomNavigationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
