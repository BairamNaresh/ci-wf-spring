
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveyApprovalState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurveyApprovalState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotNecessary"/&gt;
 *     &lt;enumeration value="Approved"/&gt;
 *     &lt;enumeration value="NeedsApproval"/&gt;
 *     &lt;enumeration value="PendingApproval"/&gt;
 *     &lt;enumeration value="ApprovalDenied"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurveyApprovalState")
@XmlEnum
public enum SurveyApprovalState {

    @XmlEnumValue("NotNecessary")
    NOT_NECESSARY("NotNecessary"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("NeedsApproval")
    NEEDS_APPROVAL("NeedsApproval"),
    @XmlEnumValue("PendingApproval")
    PENDING_APPROVAL("PendingApproval"),
    @XmlEnumValue("ApprovalDenied")
    APPROVAL_DENIED("ApprovalDenied");
    private final String value;

    SurveyApprovalState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyApprovalState fromValue(String v) {
        for (SurveyApprovalState c: SurveyApprovalState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
