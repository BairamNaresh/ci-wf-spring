
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectiveDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectiveDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Multiple"/&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="ProgressbarBegin"/&gt;
 *     &lt;enumeration value="ProgressbarEnd"/&gt;
 *     &lt;enumeration value="NoBackButton"/&gt;
 *     &lt;enumeration value="AllowBackButton"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DirectiveDataType")
@XmlEnum
public enum DirectiveDataType {

    @XmlEnumValue("Multiple")
    MULTIPLE("Multiple"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("ProgressbarBegin")
    PROGRESSBAR_BEGIN("ProgressbarBegin"),
    @XmlEnumValue("ProgressbarEnd")
    PROGRESSBAR_END("ProgressbarEnd"),
    @XmlEnumValue("NoBackButton")
    NO_BACK_BUTTON("NoBackButton"),
    @XmlEnumValue("AllowBackButton")
    ALLOW_BACK_BUTTON("AllowBackButton");
    private final String value;

    DirectiveDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectiveDataType fromValue(String v) {
        for (DirectiveDataType c: DirectiveDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
