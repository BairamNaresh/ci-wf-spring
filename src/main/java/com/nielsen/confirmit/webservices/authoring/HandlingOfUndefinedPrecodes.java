
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandlingOfUndefinedPrecodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HandlingOfUndefinedPrecodes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ContinueWithoutStoring"/&gt;
 *     &lt;enumeration value="ContinueAndStoreIfPossibleOrAbort"/&gt;
 *     &lt;enumeration value="Abort"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HandlingOfUndefinedPrecodes")
@XmlEnum
public enum HandlingOfUndefinedPrecodes {

    @XmlEnumValue("ContinueWithoutStoring")
    CONTINUE_WITHOUT_STORING("ContinueWithoutStoring"),
    @XmlEnumValue("ContinueAndStoreIfPossibleOrAbort")
    CONTINUE_AND_STORE_IF_POSSIBLE_OR_ABORT("ContinueAndStoreIfPossibleOrAbort"),
    @XmlEnumValue("Abort")
    ABORT("Abort");
    private final String value;

    HandlingOfUndefinedPrecodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HandlingOfUndefinedPrecodes fromValue(String v) {
        for (HandlingOfUndefinedPrecodes c: HandlingOfUndefinedPrecodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
