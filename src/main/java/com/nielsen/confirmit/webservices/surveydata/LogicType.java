
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogicType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AND"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="NOTIN"/&gt;
 *     &lt;enumeration value="LIKE"/&gt;
 *     &lt;enumeration value="NOTLIKE"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="ISNOT"/&gt;
 *     &lt;enumeration value="XOR"/&gt;
 *     &lt;enumeration value="BLOT"/&gt;
 *     &lt;enumeration value="BIC"/&gt;
 *     &lt;enumeration value="IMP"/&gt;
 *     &lt;enumeration value="NIMP"/&gt;
 *     &lt;enumeration value="NAND"/&gt;
 *     &lt;enumeration value="NOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogicType")
@XmlEnum
public enum LogicType {

    AND,
    OR,
    IN,
    NOTIN,
    LIKE,
    NOTLIKE,
    IS,
    ISNOT,
    XOR,
    BLOT,
    BIC,
    IMP,
    NIMP,
    NAND,
    NOR;

    public String value() {
        return name();
    }

    public static LogicType fromValue(String v) {
        return valueOf(v);
    }

}
