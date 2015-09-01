/**
 * AccountNotExistFaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Sep 02, 2015 (12:03:48 BDT)
 */
package example;

public class AccountNotExistFaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1441132017366L;
    private example.AccountNotExistFault faultMessage;

    public AccountNotExistFaultMessage() {
        super("AccountNotExistFaultMessage");
    }

    public AccountNotExistFaultMessage(java.lang.String s) {
        super(s);
    }

    public AccountNotExistFaultMessage(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public AccountNotExistFaultMessage(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(example.AccountNotExistFault msg) {
        faultMessage = msg;
    }

    public example.AccountNotExistFault getFaultMessage() {
        return faultMessage;
    }
}
