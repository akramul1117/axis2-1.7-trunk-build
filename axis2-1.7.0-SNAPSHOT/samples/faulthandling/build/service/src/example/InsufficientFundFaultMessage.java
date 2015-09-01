/**
 * InsufficientFundFaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Sep 02, 2015 (12:03:48 BDT)
 */
package example;

public class InsufficientFundFaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1441132017390L;
    private example.InsufficientFundFault faultMessage;

    public InsufficientFundFaultMessage() {
        super("InsufficientFundFaultMessage");
    }

    public InsufficientFundFaultMessage(java.lang.String s) {
        super(s);
    }

    public InsufficientFundFaultMessage(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public InsufficientFundFaultMessage(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(example.InsufficientFundFault msg) {
        faultMessage = msg;
    }

    public example.InsufficientFundFault getFaultMessage() {
        return faultMessage;
    }
}
