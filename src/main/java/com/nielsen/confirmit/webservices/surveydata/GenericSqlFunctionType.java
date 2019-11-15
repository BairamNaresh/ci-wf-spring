
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericSqlFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericSqlFunctionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NullIf"/&gt;
 *     &lt;enumeration value="IsNull"/&gt;
 *     &lt;enumeration value="Coalesce"/&gt;
 *     &lt;enumeration value="PassThrough"/&gt;
 *     &lt;enumeration value="Power"/&gt;
 *     &lt;enumeration value="Len"/&gt;
 *     &lt;enumeration value="LTrim"/&gt;
 *     &lt;enumeration value="RTrim"/&gt;
 *     &lt;enumeration value="Left"/&gt;
 *     &lt;enumeration value="Right"/&gt;
 *     &lt;enumeration value="Replicate"/&gt;
 *     &lt;enumeration value="Not"/&gt;
 *     &lt;enumeration value="GetDate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenericSqlFunctionType")
@XmlEnum
public enum GenericSqlFunctionType {

    @XmlEnumValue("NullIf")
    NULL_IF("NullIf"),
    @XmlEnumValue("IsNull")
    IS_NULL("IsNull"),
    @XmlEnumValue("Coalesce")
    COALESCE("Coalesce"),
    @XmlEnumValue("PassThrough")
    PASS_THROUGH("PassThrough"),
    @XmlEnumValue("Power")
    POWER("Power"),
    @XmlEnumValue("Len")
    LEN("Len"),
    @XmlEnumValue("LTrim")
    L_TRIM("LTrim"),
    @XmlEnumValue("RTrim")
    R_TRIM("RTrim"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Replicate")
    REPLICATE("Replicate"),
    @XmlEnumValue("Not")
    NOT("Not"),
    @XmlEnumValue("GetDate")
    GET_DATE("GetDate");
    private final String value;

    GenericSqlFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenericSqlFunctionType fromValue(String v) {
        for (GenericSqlFunctionType c: GenericSqlFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
