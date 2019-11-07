package com.nielsen.confirmit.webservices.logon;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2019-11-07T17:53:23.876+05:30
 * Generated source version: 3.3.4
 *
 */
@WebService(targetNamespace = "http://firmglobal.com/Confirmit/webservices/", name = "LogOnSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface LogOnSoap {

    @WebMethod(operationName = "LogOnUser", action = "http://firmglobal.com/Confirmit/webservices/LogOnUser")
    @RequestWrapper(localName = "LogOnUser", targetNamespace = "http://firmglobal.com/Confirmit/webservices/", className = "com.nielsen.confirmit.webservices.logon.LogOnUser")
    @ResponseWrapper(localName = "LogOnUserResponse", targetNamespace = "http://firmglobal.com/Confirmit/webservices/", className = "com.nielsen.confirmit.webservices.logon.LogOnUserResponse")
    @WebResult(name = "LogOnUserResult", targetNamespace = "http://firmglobal.com/Confirmit/webservices/")
    public java.lang.String logOnUser(

        @WebParam(name = "username", targetNamespace = "http://firmglobal.com/Confirmit/webservices/")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "http://firmglobal.com/Confirmit/webservices/")
        java.lang.String password
    );
}
