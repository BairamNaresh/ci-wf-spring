
package com.nielsen.confirmit.webservices.authoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice17"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Script" type="{http://firmglobal.com/Confirmit/webservices/}Script"/&gt;
 *         &lt;element name="PredefinedList" type="{http://firmglobal.com/Confirmit/webservices/}PredefinedList"/&gt;
 *         &lt;element name="Info" type="{http://firmglobal.com/Confirmit/webservices/}InfoForm"/&gt;
 *         &lt;element name="Quota" type="{http://firmglobal.com/Confirmit/webservices/}Quota"/&gt;
 *         &lt;element name="Condition" type="{http://firmglobal.com/Confirmit/webservices/}Condition"/&gt;
 *         &lt;element name="Grid" type="{http://firmglobal.com/Confirmit/webservices/}GridForm"/&gt;
 *         &lt;element name="Email" type="{http://firmglobal.com/Confirmit/webservices/}Email"/&gt;
 *         &lt;element name="ProjectInfo" type="{http://firmglobal.com/Confirmit/webservices/}ProjectInfo"/&gt;
 *         &lt;element name="Grid3D" type="{http://firmglobal.com/Confirmit/webservices/}Grid3DForm"/&gt;
 *         &lt;element name="Questionnaire" type="{http://firmglobal.com/Confirmit/webservices/}Questionnaire"/&gt;
 *         &lt;element name="Directive" type="{http://firmglobal.com/Confirmit/webservices/}Directive"/&gt;
 *         &lt;element name="Stop" type="{http://firmglobal.com/Confirmit/webservices/}Stop"/&gt;
 *         &lt;element name="Single" type="{http://firmglobal.com/Confirmit/webservices/}SingleForm"/&gt;
 *         &lt;element name="CallBlock" type="{http://firmglobal.com/Confirmit/webservices/}CallBlock"/&gt;
 *         &lt;element name="Block" type="{http://firmglobal.com/Confirmit/webservices/}Block"/&gt;
 *         &lt;element name="Page" type="{http://firmglobal.com/Confirmit/webservices/}Page"/&gt;
 *         &lt;element name="Multi" type="{http://firmglobal.com/Confirmit/webservices/}MultiForm"/&gt;
 *         &lt;element name="Open" type="{http://firmglobal.com/Confirmit/webservices/}OpenForm"/&gt;
 *         &lt;element name="Telephone" type="{http://firmglobal.com/Confirmit/webservices/}Telephone"/&gt;
 *         &lt;element name="Loop" type="{http://firmglobal.com/Confirmit/webservices/}Loop"/&gt;
 *         &lt;element name="Folder" type="{http://firmglobal.com/Confirmit/webservices/}Folder"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice17", propOrder = {
    "scriptOrPredefinedListOrInfo"
})
public class ArrayOfChoice17 {

    @XmlElements({
        @XmlElement(name = "Script", type = Script.class, nillable = true),
        @XmlElement(name = "PredefinedList", type = PredefinedList.class, nillable = true),
        @XmlElement(name = "Info", type = InfoForm.class, nillable = true),
        @XmlElement(name = "Quota", type = Quota.class, nillable = true),
        @XmlElement(name = "Condition", type = Condition.class, nillable = true),
        @XmlElement(name = "Grid", type = GridForm.class, nillable = true),
        @XmlElement(name = "Email", type = Email.class, nillable = true),
        @XmlElement(name = "ProjectInfo", type = ProjectInfo.class, nillable = true),
        @XmlElement(name = "Grid3D", type = Grid3DForm.class, nillable = true),
        @XmlElement(name = "Questionnaire", type = Questionnaire.class, nillable = true),
        @XmlElement(name = "Directive", type = Directive.class, nillable = true),
        @XmlElement(name = "Stop", type = Stop.class, nillable = true),
        @XmlElement(name = "Single", type = SingleForm.class, nillable = true),
        @XmlElement(name = "CallBlock", type = CallBlock.class, nillable = true),
        @XmlElement(name = "Block", type = Block.class, nillable = true),
        @XmlElement(name = "Page", type = Page.class, nillable = true),
        @XmlElement(name = "Multi", type = MultiForm.class, nillable = true),
        @XmlElement(name = "Open", type = OpenForm.class, nillable = true),
        @XmlElement(name = "Telephone", type = Telephone.class, nillable = true),
        @XmlElement(name = "Loop", type = Loop.class, nillable = true),
        @XmlElement(name = "Folder", type = Folder.class, nillable = true)
    })
    protected List<Node> scriptOrPredefinedListOrInfo;

    /**
     * Gets the value of the scriptOrPredefinedListOrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scriptOrPredefinedListOrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScriptOrPredefinedListOrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Script }
     * {@link PredefinedList }
     * {@link InfoForm }
     * {@link Quota }
     * {@link Condition }
     * {@link GridForm }
     * {@link Email }
     * {@link ProjectInfo }
     * {@link Grid3DForm }
     * {@link Questionnaire }
     * {@link Directive }
     * {@link Stop }
     * {@link SingleForm }
     * {@link CallBlock }
     * {@link Block }
     * {@link Page }
     * {@link MultiForm }
     * {@link OpenForm }
     * {@link Telephone }
     * {@link Loop }
     * {@link Folder }
     * 
     * 
     */
    public List<Node> getScriptOrPredefinedListOrInfo() {
        if (scriptOrPredefinedListOrInfo == null) {
            scriptOrPredefinedListOrInfo = new ArrayList<Node>();
        }
        return this.scriptOrPredefinedListOrInfo;
    }

}
