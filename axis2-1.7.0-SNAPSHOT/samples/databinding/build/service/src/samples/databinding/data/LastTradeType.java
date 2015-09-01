/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.4</a>, using an XML
 * Schema.
 * $Id$
 */

package samples.databinding.data;

/**
 * Class LastTradeType.
 * 
 * @version $Revision$ $Date$
 */
public abstract class LastTradeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _price
     */
    private float _price;

    /**
     * keeps track of state for field: _price
     */
    private boolean _has_price;

    /**
     * Field _date
     */
    private long _date;

    /**
     * keeps track of state for field: _date
     */
    private boolean _has_date;


      //----------------/
     //- Constructors -/
    //----------------/

    public LastTradeType() 
     {
        super();
    } //-- samples.databinding.data.LastTradeType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDate()
    {
        this._has_date= false;
    } //-- void deleteDate() 

    /**
     */
    public void deletePrice()
    {
        this._has_price= false;
    } //-- void deletePrice() 

    /**
     * Returns the value of field 'date'.
     * 
     * @return the value of field 'Date'.
     */
    public long getDate()
    {
        return this._date;
    } //-- long getDate() 

    /**
     * Returns the value of field 'price'.
     * 
     * @return the value of field 'Price'.
     */
    public float getPrice()
    {
        return this._price;
    } //-- float getPrice() 

    /**
     * Method hasDate
     * 
     * 
     * 
     * @return true if at least one Date has been added
     */
    public boolean hasDate()
    {
        return this._has_date;
    } //-- boolean hasDate() 

    /**
     * Method hasPrice
     * 
     * 
     * 
     * @return true if at least one Price has been added
     */
    public boolean hasPrice()
    {
        return this._has_price;
    } //-- boolean hasPrice() 

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
     * Sets the value of field 'date'.
     * 
     * @param date the value of field 'date'.
     */
    public void setDate(long date)
    {
        this._date = date;
        this._has_date = true;
    } //-- void setDate(long) 

    /**
     * Sets the value of field 'price'.
     * 
     * @param price the value of field 'price'.
     */
    public void setPrice(float price)
    {
        this._price = price;
        this._has_price = true;
    } //-- void setPrice(float) 

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
