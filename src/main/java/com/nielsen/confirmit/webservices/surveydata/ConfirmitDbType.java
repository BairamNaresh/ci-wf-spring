
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmitDbType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfirmitDbType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="Char"/&gt;
 *     &lt;enumeration value="NChar"/&gt;
 *     &lt;enumeration value="VarChar"/&gt;
 *     &lt;enumeration value="NVarChar"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="NText"/&gt;
 *     &lt;enumeration value="Float"/&gt;
 *     &lt;enumeration value="Numeric"/&gt;
 *     &lt;enumeration value="Datetime"/&gt;
 *     &lt;enumeration value="Guid"/&gt;
 *     &lt;enumeration value="BitVector"/&gt;
 *     &lt;enumeration value="Bool"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfirmitDbType")
@XmlEnum
public enum ConfirmitDbType {

    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Char")
    CHAR("Char"),
    @XmlEnumValue("NChar")
    N_CHAR("NChar"),
    @XmlEnumValue("VarChar")
    VAR_CHAR("VarChar"),
    @XmlEnumValue("NVarChar")
    N_VAR_CHAR("NVarChar"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("NText")
    N_TEXT("NText"),
    @XmlEnumValue("Float")
    FLOAT("Float"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Datetime")
    DATETIME("Datetime"),
    @XmlEnumValue("Guid")
    GUID("Guid"),
    @XmlEnumValue("BitVector")
    BIT_VECTOR("BitVector"),
    @XmlEnumValue("Bool")
    BOOL("Bool");
    private final String value;

    ConfirmitDbType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfirmitDbType fromValue(String v) {
        for (ConfirmitDbType c: ConfirmitDbType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
