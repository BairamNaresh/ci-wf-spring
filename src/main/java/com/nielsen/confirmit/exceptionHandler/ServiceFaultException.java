package com.nielsen.confirmit.exceptionHandler;

public class ServiceFaultException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private ServiceFaultResponse serviceFaultResponse;

    public ServiceFaultException(String message, ServiceFaultResponse serviceFaultResponse) {
        super(message);
        this.serviceFaultResponse = serviceFaultResponse;
    }

    public ServiceFaultException(String message, Throwable e, ServiceFaultResponse serviceFaultResponse) {
        super(message, e);
        this.serviceFaultResponse = serviceFaultResponse;
    }

    public ServiceFaultResponse getServiceStatus() {
        return serviceFaultResponse;
    }

    public void setServiceStatus(ServiceFaultResponse serviceFaultResponse) {
        this.serviceFaultResponse = serviceFaultResponse;
    }
}