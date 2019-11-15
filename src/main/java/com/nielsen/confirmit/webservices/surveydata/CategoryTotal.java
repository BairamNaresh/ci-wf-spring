
package com.nielsen.confirmit.webservices.surveydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryTotal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/8.5/}CategoryAnswer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuffixNameWithParent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryTotal", propOrder = {
    "suffixNameWithParent"
})
public class CategoryTotal
    extends CategoryAnswer
{

    @XmlElement(name = "SuffixNameWithParent")
    protected boolean suffixNameWithParent;

    /**
     * Gets the value of the suffixNameWithParent property.
     * 
     */
    public boolean isSuffixNameWithParent() {
        return suffixNameWithParent;
    }

    /**
     * Sets the value of the suffixNameWithParent property.
     * 
     */
    public void setSuffixNameWithParent(boolean value) {
        this.suffixNameWithParent = value;
    }

}
