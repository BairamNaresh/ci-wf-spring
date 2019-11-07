
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HierarchyUIMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HierarchyUIMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Drilldown"/&gt;
 *     &lt;enumeration value="Dropdown"/&gt;
 *     &lt;enumeration value="Legacy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HierarchyUIMode")
@XmlEnum
public enum HierarchyUIMode {

    @XmlEnumValue("Drilldown")
    DRILLDOWN("Drilldown"),
    @XmlEnumValue("Dropdown")
    DROPDOWN("Dropdown"),
    @XmlEnumValue("Legacy")
    LEGACY("Legacy");
    private final String value;

    HierarchyUIMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HierarchyUIMode fromValue(String v) {
        for (HierarchyUIMode c: HierarchyUIMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
