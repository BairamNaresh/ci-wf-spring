
package com.nielsen.confirmit.webservices.authoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HangupCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HangupCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://firmglobal.com/Confirmit/webservices/}BaseTelephoneCommand"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HangupCommand")
public class HangupCommand
    extends BaseTelephoneCommand
{


}
