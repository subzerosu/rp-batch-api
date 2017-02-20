
package org.russianpost.fclient.postserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.russianpost.fclient.Error;
import org.russianpost.fclient.File;


/**
 * <p>Java class for answerByTicketResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="answerByTicketResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://fclient.russianpost.org}file" minOccurs="0"/>
 *         &lt;element name="error" type="{http://fclient.russianpost.org}error" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "answerByTicketResponse", propOrder = {
    "value",
    "error"
})
public class AnswerByTicketResponse {

    protected File value;
    protected Error error;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setValue(File value) {
        this.value = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

}
