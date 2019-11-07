
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoSkipping"/&gt;
 *     &lt;enumeration value="Skip2PageName"/&gt;
 *     &lt;enumeration value="Skip2End"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SkipType")
@XmlEnum
public enum SkipType {

    @XmlEnumValue("NoSkipping")
    NO_SKIPPING("NoSkipping"),
    @XmlEnumValue("Skip2PageName")
    SKIP_2_PAGE_NAME("Skip2PageName"),
    @XmlEnumValue("Skip2End")
    SKIP_2_END("Skip2End");
    private final String value;

    SkipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SkipType fromValue(String v) {
        for (SkipType c: SkipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
