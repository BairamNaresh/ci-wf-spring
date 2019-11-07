
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexFallbackStrategy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlexFallbackStrategy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RenderNormalQuestion"/&gt;
 *     &lt;enumeration value="Fail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlexFallbackStrategy")
@XmlEnum
public enum FlexFallbackStrategy {

    @XmlEnumValue("RenderNormalQuestion")
    RENDER_NORMAL_QUESTION("RenderNormalQuestion"),
    @XmlEnumValue("Fail")
    FAIL("Fail");
    private final String value;

    FlexFallbackStrategy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlexFallbackStrategy fromValue(String v) {
        for (FlexFallbackStrategy c: FlexFallbackStrategy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
