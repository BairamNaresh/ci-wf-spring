
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InlineSurveyCookieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InlineSurveyCookieType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoCookie"/&gt;
 *     &lt;enumeration value="BlockRepeatRespondent"/&gt;
 *     &lt;enumeration value="RememberRespondent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InlineSurveyCookieType")
@XmlEnum
public enum InlineSurveyCookieType {

    @XmlEnumValue("NoCookie")
    NO_COOKIE("NoCookie"),
    @XmlEnumValue("BlockRepeatRespondent")
    BLOCK_REPEAT_RESPONDENT("BlockRepeatRespondent"),
    @XmlEnumValue("RememberRespondent")
    REMEMBER_RESPONDENT("RememberRespondent");
    private final String value;

    InlineSurveyCookieType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InlineSurveyCookieType fromValue(String v) {
        for (InlineSurveyCookieType c: InlineSurveyCookieType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
