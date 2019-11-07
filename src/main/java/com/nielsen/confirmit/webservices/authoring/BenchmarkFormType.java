
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkFormType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BenchmarkFormType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Measure"/&gt;
 *     &lt;enumeration value="Demography"/&gt;
 *     &lt;enumeration value="BenchmarkId"/&gt;
 *     &lt;enumeration value="MeasureType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BenchmarkFormType")
@XmlEnum
public enum BenchmarkFormType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Measure")
    MEASURE("Measure"),
    @XmlEnumValue("Demography")
    DEMOGRAPHY("Demography"),
    @XmlEnumValue("BenchmarkId")
    BENCHMARK_ID("BenchmarkId"),
    @XmlEnumValue("MeasureType")
    MEASURE_TYPE("MeasureType");
    private final String value;

    BenchmarkFormType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BenchmarkFormType fromValue(String v) {
        for (BenchmarkFormType c: BenchmarkFormType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
