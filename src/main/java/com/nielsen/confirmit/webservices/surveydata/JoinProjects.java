
package com.nielsen.confirmit.webservices.surveydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JoinProjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JoinProjects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeftProject" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryProject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RightProject" type="{http://firmglobal.com/Confirmit/webservices/8.5/}QueryProject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JoinFields" type="{http://firmglobal.com/Confirmit/webservices/8.5/}Binary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JoinProjects", propOrder = {
    "leftProject",
    "rightProject",
    "joinFields"
})
public class JoinProjects {

    @XmlElement(name = "LeftProject")
    protected List<QueryProject> leftProject;
    @XmlElement(name = "RightProject")
    protected List<QueryProject> rightProject;
    @XmlElement(name = "JoinFields")
    protected List<Binary> joinFields;

    /**
     * Gets the value of the leftProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leftProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeftProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryProject }
     * 
     * 
     */
    public List<QueryProject> getLeftProject() {
        if (leftProject == null) {
            leftProject = new ArrayList<QueryProject>();
        }
        return this.leftProject;
    }

    /**
     * Gets the value of the rightProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryProject }
     * 
     * 
     */
    public List<QueryProject> getRightProject() {
        if (rightProject == null) {
            rightProject = new ArrayList<QueryProject>();
        }
        return this.rightProject;
    }

    /**
     * Gets the value of the joinFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the joinFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoinFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Binary }
     * 
     * 
     */
    public List<Binary> getJoinFields() {
        if (joinFields == null) {
            joinFields = new ArrayList<Binary>();
        }
        return this.joinFields;
    }

}
