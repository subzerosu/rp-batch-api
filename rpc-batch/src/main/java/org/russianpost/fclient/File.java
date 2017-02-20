
package org.russianpost.fclient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for file complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="file">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{http://fclient.russianpost.org}item" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FileName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FileTypeID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="FileNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="SenderID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="DatePreparation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file", propOrder = {
    "item"
})
public class File {

    @XmlElement(name = "Item", required = true)
    protected List<Item> item;
    @XmlAttribute(name = "FileName", required = true)
    protected String fileName;
    @XmlAttribute(name = "FileTypeID", required = true)
    protected BigInteger fileTypeID;
    @XmlAttribute(name = "FileNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fileNumber;
    @XmlAttribute(name = "SenderID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger senderID;
    @XmlAttribute(name = "RecipientID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recipientID;
    @XmlAttribute(name = "DatePreparation", required = true)
    protected String datePreparation;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileTypeID() {
        return fileTypeID;
    }

    /**
     * Sets the value of the fileTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileTypeID(BigInteger value) {
        this.fileTypeID = value;
    }

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileNumber(BigInteger value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSenderID(BigInteger value) {
        this.senderID = value;
    }

    /**
     * Gets the value of the recipientID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecipientID() {
        return recipientID;
    }

    /**
     * Sets the value of the recipientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecipientID(BigInteger value) {
        this.recipientID = value;
    }

    /**
     * Gets the value of the datePreparation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatePreparation() {
        return datePreparation;
    }

    /**
     * Sets the value of the datePreparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatePreparation(String value) {
        this.datePreparation = value;
    }

}
