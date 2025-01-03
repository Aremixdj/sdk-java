//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.29 at 03:15:31 AM IST 
//


package net.authorize.api.contract.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentMaskedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentMaskedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="creditCard" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}creditCardMaskedType"/>
 *           &lt;element name="bankAccount" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}bankAccountMaskedType"/>
 *           &lt;element name="tokenInformation" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}tokenMaskedType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentMaskedType", propOrder = {
    "creditCard",
    "bankAccount",
    "tokenInformation"
})
public class PaymentMaskedType {

    protected CreditCardMaskedType creditCard;
    protected BankAccountMaskedType bankAccount;
    protected TokenMaskedType tokenInformation;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardMaskedType }
     *     
     */
    public CreditCardMaskedType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardMaskedType }
     *     
     */
    public void setCreditCard(CreditCardMaskedType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountMaskedType }
     *     
     */
    public BankAccountMaskedType getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountMaskedType }
     *     
     */
    public void setBankAccount(BankAccountMaskedType value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the tokenInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TokenMaskedType }
     *     
     */
    public TokenMaskedType getTokenInformation() {
        return tokenInformation;
    }

    /**
     * Sets the value of the tokenInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenMaskedType }
     *     
     */
    public void setTokenInformation(TokenMaskedType value) {
        this.tokenInformation = value;
    }

}
