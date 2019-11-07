
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveyLogicModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurveyLogicModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ConditionBased"/&gt;
 *     &lt;enumeration value="SkipBased"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurveyLogicModeType")
@XmlEnum
public enum SurveyLogicModeType {

    @XmlEnumValue("ConditionBased")
    CONDITION_BASED("ConditionBased"),
    @XmlEnumValue("SkipBased")
    SKIP_BASED("SkipBased");
    private final String value;

    SurveyLogicModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyLogicModeType fromValue(String v) {
        for (SurveyLogicModeType c: SurveyLogicModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
