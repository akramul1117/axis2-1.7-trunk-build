/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.4</a>, using an XML
 * Schema.
 * $Id$
 */

package samples.databinding.data;

/**
 * Class ChangeType.
 * 
 * @version $Revision$ $Date$
 */
public abstract class ChangeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dollar
     */
    private float _dollar;

    /**
     * keeps track of state for field: _dollar
     */
    private boolean _has_dollar;

    /**
     * Field _percent
     */
    private float _percent;

    /**
     * keeps track of state for field: _percent
     */
    private boolean _has_percent;

    /**
     * Field _positive
     */
    private boolean _positive;

    /**
     * keeps track of state for field: _positive
     */
    private boolean _has_positive;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangeType() 
     {
        super();
    } //-- samples.databinding.data.ChangeType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDollar()
    {
        this._has_dollar= false;
    } //-- void deleteDollar() 

    /**
     */
    public void deletePercent()
    {
        this._has_percent= false;
    } //-- void deletePercent() 

    /**
     */
    public void deletePositive()
    {
        this._has_positive= false;
    } //-- void deletePositive() 

    /**
     * Returns the value of field 'dollar'.
     * 
     * @return the value of field 'Dollar'.
     */
    public float getDollar()
    {
        return this._dollar;
    } //-- float getDollar() 

    /**
     * Returns the value of field 'percent'.
     * 
     * @return the value of field 'Percent'.
     */
    public float getPercent()
    {
        return this._percent;
    } //-- float getPercent() 

    /**
     * Returns the value of field 'positive'.
     * 
     * @return the value of field 'Positive'.
     */
    public boolean getPositive()
    {
        return this._positive;
    } //-- boolean getPositive() 

    /**
     * Method hasDollar
     * 
     * 
     * 
     * @return true if at least one Dollar has been added
     */
    public boolean hasDollar()
    {
        return this._has_dollar;
    } //-- boolean hasDollar() 

    /**
     * Method hasPercent
     * 
     * 
     * 
     * @return true if at least one Percent has been added
     */
    public boolean hasPercent()
    {
        return this._has_percent;
    } //-- boolean hasPercent() 

    /**
     * Method hasPositive
     * 
     * 
     * 
     * @return true if at least one Positive has been added
     */
    public boolean hasPositive()
    {
        return this._has_positive;
    } //-- boolean hasPositive() 

    /**
     * Returns the value of field 'positive'.
     * 
     * @return the value of field 'Positive'.
     */
    public boolean isPositive()
    {
        return this._positive;
    } //-- boolean isPositive() 

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
     * Sets the value of field 'dollar'.
     * 
     * @param dollar the value of field 'dollar'.
     */
    public void setDollar(float dollar)
    {
        this._dollar = dollar;
        this._has_dollar = true;
    } //-- void setDollar(float) 

    /**
     * Sets the value of field 'percent'.
     * 
     * @param percent the value of field 'percent'.
     */
    public void setPercent(float percent)
    {
        this._percent = percent;
        this._has_percent = true;
    } //-- void setPercent(float) 

    /**
     * Sets the value of field 'positive'.
     * 
     * @param positive the value of field 'positive'.
     */
    public void setPositive(boolean positive)
    {
        this._positive = positive;
        this._has_positive = true;
    } //-- void setPositive(boolean) 

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
