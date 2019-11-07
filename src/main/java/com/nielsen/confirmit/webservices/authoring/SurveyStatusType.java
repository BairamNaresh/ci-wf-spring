
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveyStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurveyStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Production"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="NotYetStarted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurveyStatusType")
@XmlEnum
public enum SurveyStatusType {

    @XmlEnumValue("Production")
    PRODUCTION("Production"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("NotYetStarted")
    NOT_YET_STARTED("NotYetStarted");
    private final String value;

    SurveyStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyStatusType fromValue(String v) {
        for (SurveyStatusType c: SurveyStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
