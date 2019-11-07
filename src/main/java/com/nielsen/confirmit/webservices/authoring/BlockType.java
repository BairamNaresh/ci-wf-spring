
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BlockType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="StartBlock"/&gt;
 *     &lt;enumeration value="EndBlock"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BlockType")
@XmlEnum
public enum BlockType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("StartBlock")
    START_BLOCK("StartBlock"),
    @XmlEnumValue("EndBlock")
    END_BLOCK("EndBlock");
    private final String value;

    BlockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BlockType fromValue(String v) {
        for (BlockType c: BlockType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
