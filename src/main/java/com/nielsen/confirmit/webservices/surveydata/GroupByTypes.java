
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupByTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupByTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Rollup"/&gt;
 *     &lt;enumeration value="Cube"/&gt;
 *     &lt;enumeration value="RimTotals"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupByTypes")
@XmlEnum
public enum GroupByTypes {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Rollup")
    ROLLUP("Rollup"),
    @XmlEnumValue("Cube")
    CUBE("Cube"),
    @XmlEnumValue("RimTotals")
    RIM_TOTALS("RimTotals");
    private final String value;

    GroupByTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupByTypes fromValue(String v) {
        for (GroupByTypes c: GroupByTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
