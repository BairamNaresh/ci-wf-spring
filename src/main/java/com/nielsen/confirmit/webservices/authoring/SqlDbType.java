
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SqlDbType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SqlDbType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BigInt"/&gt;
 *     &lt;enumeration value="Binary"/&gt;
 *     &lt;enumeration value="Bit"/&gt;
 *     &lt;enumeration value="Char"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *     &lt;enumeration value="Float"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="Int"/&gt;
 *     &lt;enumeration value="Money"/&gt;
 *     &lt;enumeration value="NChar"/&gt;
 *     &lt;enumeration value="NText"/&gt;
 *     &lt;enumeration value="NVarChar"/&gt;
 *     &lt;enumeration value="Real"/&gt;
 *     &lt;enumeration value="UniqueIdentifier"/&gt;
 *     &lt;enumeration value="SmallDateTime"/&gt;
 *     &lt;enumeration value="SmallInt"/&gt;
 *     &lt;enumeration value="SmallMoney"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Timestamp"/&gt;
 *     &lt;enumeration value="TinyInt"/&gt;
 *     &lt;enumeration value="VarBinary"/&gt;
 *     &lt;enumeration value="VarChar"/&gt;
 *     &lt;enumeration value="Variant"/&gt;
 *     &lt;enumeration value="Xml"/&gt;
 *     &lt;enumeration value="Udt"/&gt;
 *     &lt;enumeration value="Structured"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Time"/&gt;
 *     &lt;enumeration value="DateTime2"/&gt;
 *     &lt;enumeration value="DateTimeOffset"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SqlDbType")
@XmlEnum
public enum SqlDbType {

    @XmlEnumValue("BigInt")
    BIG_INT("BigInt"),
    @XmlEnumValue("Binary")
    BINARY("Binary"),
    @XmlEnumValue("Bit")
    BIT("Bit"),
    @XmlEnumValue("Char")
    CHAR("Char"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Float")
    FLOAT("Float"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Int")
    INT("Int"),
    @XmlEnumValue("Money")
    MONEY("Money"),
    @XmlEnumValue("NChar")
    N_CHAR("NChar"),
    @XmlEnumValue("NText")
    N_TEXT("NText"),
    @XmlEnumValue("NVarChar")
    N_VAR_CHAR("NVarChar"),
    @XmlEnumValue("Real")
    REAL("Real"),
    @XmlEnumValue("UniqueIdentifier")
    UNIQUE_IDENTIFIER("UniqueIdentifier"),
    @XmlEnumValue("SmallDateTime")
    SMALL_DATE_TIME("SmallDateTime"),
    @XmlEnumValue("SmallInt")
    SMALL_INT("SmallInt"),
    @XmlEnumValue("SmallMoney")
    SMALL_MONEY("SmallMoney"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Timestamp")
    TIMESTAMP("Timestamp"),
    @XmlEnumValue("TinyInt")
    TINY_INT("TinyInt"),
    @XmlEnumValue("VarBinary")
    VAR_BINARY("VarBinary"),
    @XmlEnumValue("VarChar")
    VAR_CHAR("VarChar"),
    @XmlEnumValue("Variant")
    VARIANT("Variant"),
    @XmlEnumValue("Xml")
    XML("Xml"),
    @XmlEnumValue("Udt")
    UDT("Udt"),
    @XmlEnumValue("Structured")
    STRUCTURED("Structured"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("DateTime2")
    DATE_TIME_2("DateTime2"),
    @XmlEnumValue("DateTimeOffset")
    DATE_TIME_OFFSET("DateTimeOffset");
    private final String value;

    SqlDbType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SqlDbType fromValue(String v) {
        for (SqlDbType c: SqlDbType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
