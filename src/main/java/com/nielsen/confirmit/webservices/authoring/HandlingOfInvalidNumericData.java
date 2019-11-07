
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandlingOfInvalidNumericData.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HandlingOfInvalidNumericData"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Abort"/&gt;
 *     &lt;enumeration value="ContinueWithoutStoring"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HandlingOfInvalidNumericData")
@XmlEnum
public enum HandlingOfInvalidNumericData {

    @XmlEnumValue("Abort")
    ABORT("Abort"),
    @XmlEnumValue("ContinueWithoutStoring")
    CONTINUE_WITHOUT_STORING("ContinueWithoutStoring");
    private final String value;

    HandlingOfInvalidNumericData(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HandlingOfInvalidNumericData fromValue(String v) {
        for (HandlingOfInvalidNumericData c: HandlingOfInvalidNumericData.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
