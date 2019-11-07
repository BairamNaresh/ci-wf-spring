
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="Multi"/&gt;
 *     &lt;enumeration value="Grid"/&gt;
 *     &lt;enumeration value="Grid3D"/&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Info"/&gt;
 *     &lt;enumeration value="Loop"/&gt;
 *     &lt;enumeration value="Condition"/&gt;
 *     &lt;enumeration value="Directive"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="Folder"/&gt;
 *     &lt;enumeration value="Block"/&gt;
 *     &lt;enumeration value="Page"/&gt;
 *     &lt;enumeration value="Script"/&gt;
 *     &lt;enumeration value="Root"/&gt;
 *     &lt;enumeration value="Questionnaire"/&gt;
 *     &lt;enumeration value="Quota"/&gt;
 *     &lt;enumeration value="PredefinedList"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="ProjectInfo"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="CallBlock"/&gt;
 *     &lt;enumeration value="Chart"/&gt;
 *     &lt;enumeration value="Telephone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeType")
@XmlEnum
public enum NodeType {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Multi")
    MULTI("Multi"),
    @XmlEnumValue("Grid")
    GRID("Grid"),
    @XmlEnumValue("Grid3D")
    GRID_3_D("Grid3D"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Loop")
    LOOP("Loop"),
    @XmlEnumValue("Condition")
    CONDITION("Condition"),
    @XmlEnumValue("Directive")
    DIRECTIVE("Directive"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Folder")
    FOLDER("Folder"),
    @XmlEnumValue("Block")
    BLOCK("Block"),
    @XmlEnumValue("Page")
    PAGE("Page"),
    @XmlEnumValue("Script")
    SCRIPT("Script"),
    @XmlEnumValue("Root")
    ROOT("Root"),
    @XmlEnumValue("Questionnaire")
    QUESTIONNAIRE("Questionnaire"),
    @XmlEnumValue("Quota")
    QUOTA("Quota"),
    @XmlEnumValue("PredefinedList")
    PREDEFINED_LIST("PredefinedList"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("ProjectInfo")
    PROJECT_INFO("ProjectInfo"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("CallBlock")
    CALL_BLOCK("CallBlock"),
    @XmlEnumValue("Chart")
    CHART("Chart"),
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone");
    private final String value;

    NodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeType fromValue(String v) {
        for (NodeType c: NodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
