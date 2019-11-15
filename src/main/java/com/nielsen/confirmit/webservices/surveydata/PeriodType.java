
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Year"/&gt;
 *     &lt;enumeration value="Quarter"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *     &lt;enumeration value="Week"/&gt;
 *     &lt;enumeration value="DayOfYear"/&gt;
 *     &lt;enumeration value="DayOfMonth"/&gt;
 *     &lt;enumeration value="Hour"/&gt;
 *     &lt;enumeration value="Minute"/&gt;
 *     &lt;enumeration value="Second"/&gt;
 *     &lt;enumeration value="Weekday"/&gt;
 *     &lt;enumeration value="Millisecond"/&gt;
 *     &lt;enumeration value="ShiftedYear"/&gt;
 *     &lt;enumeration value="ShiftedQuarter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodType")
@XmlEnum
public enum PeriodType {

    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("DayOfYear")
    DAY_OF_YEAR("DayOfYear"),
    @XmlEnumValue("DayOfMonth")
    DAY_OF_MONTH("DayOfMonth"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Minute")
    MINUTE("Minute"),
    @XmlEnumValue("Second")
    SECOND("Second"),
    @XmlEnumValue("Weekday")
    WEEKDAY("Weekday"),
    @XmlEnumValue("Millisecond")
    MILLISECOND("Millisecond"),
    @XmlEnumValue("ShiftedYear")
    SHIFTED_YEAR("ShiftedYear"),
    @XmlEnumValue("ShiftedQuarter")
    SHIFTED_QUARTER("ShiftedQuarter");
    private final String value;

    PeriodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodType fromValue(String v) {
        for (PeriodType c: PeriodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
