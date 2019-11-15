
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeightingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DatabaseWeights"/&gt;
 *     &lt;enumeration value="ExternalWeights"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightingType")
@XmlEnum
public enum WeightingType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DatabaseWeights")
    DATABASE_WEIGHTS("DatabaseWeights"),
    @XmlEnumValue("ExternalWeights")
    EXTERNAL_WEIGHTS("ExternalWeights");
    private final String value;

    WeightingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeightingType fromValue(String v) {
        for (WeightingType c: WeightingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
