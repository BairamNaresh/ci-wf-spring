
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ProjectOnly"/&gt;
 *     &lt;enumeration value="PanelOnly"/&gt;
 *     &lt;enumeration value="ProjectAndPanel"/&gt;
 *     &lt;enumeration value="EnterprisePanelOnly"/&gt;
 *     &lt;enumeration value="PollOnly"/&gt;
 *     &lt;enumeration value="ProjectAndPoll"/&gt;
 *     &lt;enumeration value="StandardPanelOnly"/&gt;
 *     &lt;enumeration value="StandardAndProfessionalPanels"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProjectType")
@XmlEnum
public enum ProjectType {

    @XmlEnumValue("ProjectOnly")
    PROJECT_ONLY("ProjectOnly"),
    @XmlEnumValue("PanelOnly")
    PANEL_ONLY("PanelOnly"),
    @XmlEnumValue("ProjectAndPanel")
    PROJECT_AND_PANEL("ProjectAndPanel"),
    @XmlEnumValue("EnterprisePanelOnly")
    ENTERPRISE_PANEL_ONLY("EnterprisePanelOnly"),
    @XmlEnumValue("PollOnly")
    POLL_ONLY("PollOnly"),
    @XmlEnumValue("ProjectAndPoll")
    PROJECT_AND_POLL("ProjectAndPoll"),
    @XmlEnumValue("StandardPanelOnly")
    STANDARD_PANEL_ONLY("StandardPanelOnly"),
    @XmlEnumValue("StandardAndProfessionalPanels")
    STANDARD_AND_PROFESSIONAL_PANELS("StandardAndProfessionalPanels");
    private final String value;

    ProjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectType fromValue(String v) {
        for (ProjectType c: ProjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
