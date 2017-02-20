
package org.russianpost.fclient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="OperTypeID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="OperCtgID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="OperName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateOper" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IndexOper" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation")
public class Operation {

    @XmlAttribute(name = "OperTypeID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger operTypeID;
    @XmlAttribute(name = "OperCtgID", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger operCtgID;
    @XmlAttribute(name = "OperName", required = true)
    protected String operName;
    @XmlAttribute(name = "DateOper", required = true)
    protected String dateOper;
    @XmlAttribute(name = "IndexOper", required = true)
    protected String indexOper;

    /**
     * Gets the value of the operTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOperTypeID() {
        return operTypeID;
    }

    /**
     * Sets the value of the operTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOperTypeID(BigInteger value) {
        this.operTypeID = value;
    }

    /**
     * Gets the value of the operCtgID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOperCtgID() {
        return operCtgID;
    }

    /**
     * Sets the value of the operCtgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOperCtgID(BigInteger value) {
        this.operCtgID = value;
    }

    /**
     * Gets the value of the operName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperName() {
        return operName;
    }

    /**
     * Sets the value of the operName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperName(String value) {
        this.operName = value;
    }

    /**
     * Gets the value of the dateOper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOper() {
        return dateOper;
    }

    /**
     * Sets the value of the dateOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOper(String value) {
        this.dateOper = value;
    }

    /**
     * Gets the value of the indexOper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexOper() {
        return indexOper;
    }

    /**
     * Sets the value of the indexOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexOper(String value) {
        this.indexOper = value;
    }

}
