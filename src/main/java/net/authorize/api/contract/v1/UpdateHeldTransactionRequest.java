//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.29 at 03:15:31 AM IST 
//


package net.authorize.api.contract.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiRequest">
 *       &lt;sequence>
 *         &lt;element name="heldTransactionRequest" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}heldTransactionRequestType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heldTransactionRequest"
})
@XmlRootElement(name = "updateHeldTransactionRequest")
public class UpdateHeldTransactionRequest
    extends ANetApiRequest
{

    @XmlElement(required = true)
    protected HeldTransactionRequestType heldTransactionRequest;

    /**
     * Gets the value of the heldTransactionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HeldTransactionRequestType }
     *     
     */
    public HeldTransactionRequestType getHeldTransactionRequest() {
        return heldTransactionRequest;
    }

    /**
     * Sets the value of the heldTransactionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeldTransactionRequestType }
     *     
     */
    public void setHeldTransactionRequest(HeldTransactionRequestType value) {
        this.heldTransactionRequest = value;
    }

}
