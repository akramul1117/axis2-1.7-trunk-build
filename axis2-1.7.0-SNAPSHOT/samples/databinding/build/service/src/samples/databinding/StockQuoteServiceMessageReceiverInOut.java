/**
 * StockQuoteServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Sep 02, 2015 (12:03:48 BDT)
 */
package samples.databinding;


/**
 *  StockQuoteServiceMessageReceiverInOut message receiver
 */
public class StockQuoteServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            StockQuoteServiceSkeleton skel = (StockQuoteServiceSkeleton) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("getStockQuote".equals(methodName)) {
                    org.apache.axiom.om.OMElement getStockQuoteResponse5 = null;
                    org.apache.axiom.om.OMElement wrappedParam = (org.apache.axiom.om.OMElement) fromOM(msgContext.getEnvelope()
                                                                                                                  .getBody()
                                                                                                                  .getFirstElement(),
                            org.apache.axiom.om.OMElement.class);

                    getStockQuoteResponse5 = skel.getStockQuote(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getStockQuoteResponse5, false,
                            new javax.xml.namespace.QName(
                                "http://w3.ibm.com/schemas/services/2002/11/15/stockquote",
                                "getStockQuoteResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement fromOM(
        org.apache.axiom.om.OMElement param, java.lang.Class type)
        throws org.apache.axis2.AxisFault {
        return param;
    }

    private org.apache.axiom.om.OMElement toOM(
        org.apache.axiom.om.OMElement param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        return param;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.apache.axiom.om.OMElement param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(param);

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory)
        throws org.apache.axis2.AxisFault {
        return factory.getDefaultEnvelope();
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
