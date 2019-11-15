
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArithmeticType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArithmeticType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="SUB"/&gt;
 *     &lt;enumeration value="MULT"/&gt;
 *     &lt;enumeration value="DIV"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="REM"/&gt;
 *     &lt;enumeration value="POWER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArithmeticType")
@XmlEnum
public enum ArithmeticType {

    ADD,
    SUB,
    MULT,
    DIV,
    MOD,
    REM,
    POWER;

    public String value() {
        return name();
    }

    public static ArithmeticType fromValue(String v) {
        return valueOf(v);
    }

}
