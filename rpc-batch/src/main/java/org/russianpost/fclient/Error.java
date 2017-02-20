
package org.russianpost.fclient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for error complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="error">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="ErrorTypeID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="ErrorName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error")
public class Error {

    @XmlAttribute(name = "ErrorTypeID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger errorTypeID;
    @XmlAttribute(name = "ErrorName", required = true)
    protected String errorName;

    /**
     * Gets the value of the errorTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrorTypeID() {
        return errorTypeID;
    }

    /**
     * Sets the value of the errorTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrorTypeID(BigInteger value) {
        this.errorTypeID = value;
    }

    /**
     * Gets the value of the errorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorName() {
        return errorName;
    }

    /**
     * Sets the value of the errorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorName(String value) {
        this.errorName = value;
    }

}
