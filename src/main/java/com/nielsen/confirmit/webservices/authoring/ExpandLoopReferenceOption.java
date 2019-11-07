
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpandLoopReferenceOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpandLoopReferenceOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ExpandAll"/&gt;
 *     &lt;enumeration value="ExpandIfNotMoreThen"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExpandLoopReferenceOption")
@XmlEnum
public enum ExpandLoopReferenceOption {

    @XmlEnumValue("ExpandAll")
    EXPAND_ALL("ExpandAll"),
    @XmlEnumValue("ExpandIfNotMoreThen")
    EXPAND_IF_NOT_MORE_THEN("ExpandIfNotMoreThen");
    private final String value;

    ExpandLoopReferenceOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpandLoopReferenceOption fromValue(String v) {
        for (ExpandLoopReferenceOption c: ExpandLoopReferenceOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
