
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnaryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABS"/&gt;
 *     &lt;enumeration value="AVG"/&gt;
 *     &lt;enumeration value="COUNT"/&gt;
 *     &lt;enumeration value="SUM"/&gt;
 *     &lt;enumeration value="MIN"/&gt;
 *     &lt;enumeration value="MAX"/&gt;
 *     &lt;enumeration value="STDEV"/&gt;
 *     &lt;enumeration value="STDEVP"/&gt;
 *     &lt;enumeration value="VAR"/&gt;
 *     &lt;enumeration value="VARP"/&gt;
 *     &lt;enumeration value="UNWEIGHTEDVAR"/&gt;
 *     &lt;enumeration value="NEWID"/&gt;
 *     &lt;enumeration value="BASE"/&gt;
 *     &lt;enumeration value="MODE"/&gt;
 *     &lt;enumeration value="MEDIAN"/&gt;
 *     &lt;enumeration value="EFFBASE"/&gt;
 *     &lt;enumeration value="STDERROR"/&gt;
 *     &lt;enumeration value="WEIGHTEDMEDIAN"/&gt;
 *     &lt;enumeration value="WEIGHTEDMODE"/&gt;
 *     &lt;enumeration value="SUMOFSQUARES"/&gt;
 *     &lt;enumeration value="SUMOFSQUAREDWEIGHTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnaryType")
@XmlEnum
public enum UnaryType {

    ABS,
    AVG,
    COUNT,
    SUM,
    MIN,
    MAX,
    STDEV,
    STDEVP,
    VAR,
    VARP,
    UNWEIGHTEDVAR,
    NEWID,
    BASE,
    MODE,
    MEDIAN,
    EFFBASE,
    STDERROR,
    WEIGHTEDMEDIAN,
    WEIGHTEDMODE,
    SUMOFSQUARES,
    SUMOFSQUAREDWEIGHTS;

    public String value() {
        return name();
    }

    public static UnaryType fromValue(String v) {
        return valueOf(v);
    }

}
