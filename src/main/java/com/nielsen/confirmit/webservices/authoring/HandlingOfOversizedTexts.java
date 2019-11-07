
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandlingOfOversizedTexts.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HandlingOfOversizedTexts"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ContinueAndTruncate"/&gt;
 *     &lt;enumeration value="Abort"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HandlingOfOversizedTexts")
@XmlEnum
public enum HandlingOfOversizedTexts {

    @XmlEnumValue("ContinueAndTruncate")
    CONTINUE_AND_TRUNCATE("ContinueAndTruncate"),
    @XmlEnumValue("Abort")
    ABORT("Abort");
    private final String value;

    HandlingOfOversizedTexts(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HandlingOfOversizedTexts fromValue(String v) {
        for (HandlingOfOversizedTexts c: HandlingOfOversizedTexts.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
