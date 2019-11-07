
package com.nielsen.confirmit.webservices.authoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLangSpecString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLangSpecString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LangSpecString" type="{http://firmglobal.com/Confirmit/webservices/}LangSpecString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLangSpecString", propOrder = {
    "langSpecString"
})
public class ArrayOfLangSpecString {

    @XmlElement(name = "LangSpecString", nillable = true)
    protected List<LangSpecString> langSpecString;

    /**
     * Gets the value of the langSpecString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the langSpecString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLangSpecString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangSpecString }
     * 
     * 
     */
    public List<LangSpecString> getLangSpecString() {
        if (langSpecString == null) {
            langSpecString = new ArrayList<LangSpecString>();
        }
        return this.langSpecString;
    }

}
