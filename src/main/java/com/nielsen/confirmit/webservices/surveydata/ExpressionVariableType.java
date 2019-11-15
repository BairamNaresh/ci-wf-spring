
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionVariableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpressionVariableType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Response"/&gt;
 *     &lt;enumeration value="Panel"/&gt;
 *     &lt;enumeration value="BitStream"/&gt;
 *     &lt;enumeration value="Respondent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExpressionVariableType")
@XmlEnum
public enum ExpressionVariableType {

    @XmlEnumValue("Response")
    RESPONSE("Response"),
    @XmlEnumValue("Panel")
    PANEL("Panel"),
    @XmlEnumValue("BitStream")
    BIT_STREAM("BitStream"),
    @XmlEnumValue("Respondent")
    RESPONDENT("Respondent");
    private final String value;

    ExpressionVariableType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpressionVariableType fromValue(String v) {
        for (ExpressionVariableType c: ExpressionVariableType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
