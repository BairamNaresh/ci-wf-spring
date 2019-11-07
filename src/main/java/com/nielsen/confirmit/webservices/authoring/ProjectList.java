
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}ProjectListBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Projects" type="{http://firmglobal.com/Confirmit/webservices/}ArrayOfProject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectList", propOrder = {
    "projects"
})
public class ProjectList
    extends ProjectListBase
{

    @XmlElement(name = "Projects")
    protected ArrayOfProject projects;

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProject }
     *     
     */
    public ArrayOfProject getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProject }
     *     
     */
    public void setProjects(ArrayOfProject value) {
        this.projects = value;
    }

}
