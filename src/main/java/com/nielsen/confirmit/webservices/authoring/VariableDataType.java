
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariableDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariableDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Hidden"/&gt;
 *     &lt;enumeration value="Background"/&gt;
 *     &lt;enumeration value="Recoded"/&gt;
 *     &lt;enumeration value="Panel"/&gt;
 *     &lt;enumeration value="Recoding"/&gt;
 *     &lt;enumeration value="PanelVisible"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VariableDataType")
@XmlEnum
public enum VariableDataType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),
    @XmlEnumValue("Background")
    BACKGROUND("Background"),
    @XmlEnumValue("Recoded")
    RECODED("Recoded"),
    @XmlEnumValue("Panel")
    PANEL("Panel"),
    @XmlEnumValue("Recoding")
    RECODING("Recoding"),
    @XmlEnumValue("PanelVisible")
    PANEL_VISIBLE("PanelVisible");
    private final String value;

    VariableDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariableDataType fromValue(String v) {
        for (VariableDataType c: VariableDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
