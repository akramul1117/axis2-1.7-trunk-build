/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.4</a>, using an XML
 * Schema.
 * $Id$
 */

package samples.databinding.data;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class GetStockQuote.
 * 
 * @version $Revision$ $Date$
 */
public class GetStockQuote implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _symbol
     */
    private java.lang.String _symbol;


      //----------------/
     //- Constructors -/
    //----------------/

    public GetStockQuote() 
     {
        super();
    } //-- samples.databinding.data.GetStockQuote()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'symbol'.
     * 
     * @return the value of field 'Symbol'.
     */
    public java.lang.String getSymbol()
    {
        return this._symbol;
    } //-- java.lang.String getSymbol() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'symbol'.
     * 
     * @param symbol the value of field 'symbol'.
     */
    public void setSymbol(java.lang.String symbol)
    {
        this._symbol = symbol;
    } //-- void setSymbol(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled samples.databinding.data.GetStockQuot
     */
    public static samples.databinding.data.GetStockQuote unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (samples.databinding.data.GetStockQuote) Unmarshaller.unmarshal(samples.databinding.data.GetStockQuote.class, reader);
    } //-- samples.databinding.data.GetStockQuote unmarshal(java.io.Reader) 

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
