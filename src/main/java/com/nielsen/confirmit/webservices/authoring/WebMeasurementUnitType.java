
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebMeasurementUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebMeasurementUnitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pixels"/&gt;
 *     &lt;enumeration value="Em"/&gt;
 *     &lt;enumeration value="Percent"/&gt;
 *     &lt;enumeration value="Points"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WebMeasurementUnitType")
@XmlEnum
public enum WebMeasurementUnitType {

    @XmlEnumValue("Pixels")
    PIXELS("Pixels"),
    @XmlEnumValue("Em")
    EM("Em"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Points")
    POINTS("Points");
    private final String value;

    WebMeasurementUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebMeasurementUnitType fromValue(String v) {
        for (WebMeasurementUnitType c: WebMeasurementUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
