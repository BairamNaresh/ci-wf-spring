
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleTransferDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleTransferDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}TransferDefBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludeSystemVariables" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleTransferDef", propOrder = {
    "includeSystemVariables"
})
public class SimpleTransferDef
    extends TransferDefBase
{

    @XmlElement(name = "IncludeSystemVariables")
    protected boolean includeSystemVariables;

    /**
     * Gets the value of the includeSystemVariables property.
     * 
     */
    public boolean isIncludeSystemVariables() {
        return includeSystemVariables;
    }

    /**
     * Sets the value of the includeSystemVariables property.
     * 
     */
    public void setIncludeSystemVariables(boolean value) {
        this.includeSystemVariables = value;
    }

}
