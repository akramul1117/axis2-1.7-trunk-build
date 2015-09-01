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
 * Class Quote.
 * 
 * @version $Revision$ $Date$
 */
public class Quote implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _symbol
     */
    private java.lang.String _symbol;

    /**
     * Field _volume
     */
    private int _volume;

    /**
     * keeps track of state for field: _volume
     */
    private boolean _has_volume;

    /**
     * Field _lastTrade
     */
    private samples.databinding.data.LastTrade _lastTrade;

    /**
     * Field _change
     */
    private samples.databinding.data.Change _change;


      //----------------/
     //- Constructors -/
    //----------------/

    public Quote() 
     {
        super();
    } //-- samples.databinding.data.Quote()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteVolume()
    {
        this._has_volume= false;
    } //-- void deleteVolume() 

    /**
     * Returns the value of field 'change'.
     * 
     * @return the value of field 'Change'.
     */
    public samples.databinding.data.Change getChange()
    {
        return this._change;
    } //-- samples.databinding.data.Change getChange() 

    /**
     * Returns the value of field 'lastTrade'.
     * 
     * @return the value of field 'LastTrade'.
     */
    public samples.databinding.data.LastTrade getLastTrade()
    {
        return this._lastTrade;
    } //-- samples.databinding.data.LastTrade getLastTrade() 

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
     * Returns the value of field 'volume'.
     * 
     * @return the value of field 'Volume'.
     */
    public int getVolume()
    {
        return this._volume;
    } //-- int getVolume() 

    /**
     * Method hasVolume
     * 
     * 
     * 
     * @return true if at least one Volume has been added
     */
    public boolean hasVolume()
    {
        return this._has_volume;
    } //-- boolean hasVolume() 

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
     * Sets the value of field 'change'.
     * 
     * @param change the value of field 'change'.
     */
    public void setChange(samples.databinding.data.Change change)
    {
        this._change = change;
    } //-- void setChange(samples.databinding.data.Change) 

    /**
     * Sets the value of field 'lastTrade'.
     * 
     * @param lastTrade the value of field 'lastTrade'.
     */
    public void setLastTrade(samples.databinding.data.LastTrade lastTrade)
    {
        this._lastTrade = lastTrade;
    } //-- void setLastTrade(samples.databinding.data.LastTrade) 

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
     * Sets the value of field 'volume'.
     * 
     * @param volume the value of field 'volume'.
     */
    public void setVolume(int volume)
    {
        this._volume = volume;
        this._has_volume = true;
    } //-- void setVolume(int) 

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
     * @return the unmarshaled samples.databinding.data.Quote
     */
    public static samples.databinding.data.Quote unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (samples.databinding.data.Quote) Unmarshaller.unmarshal(samples.databinding.data.Quote.class, reader);
    } //-- samples.databinding.data.Quote unmarshal(java.io.Reader) 

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
