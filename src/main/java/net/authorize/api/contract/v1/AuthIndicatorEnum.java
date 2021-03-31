//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authIndicatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authIndicatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pre"/>
 *     &lt;enumeration value="final"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authIndicatorEnum")
@XmlEnum
public enum AuthIndicatorEnum {

    @XmlEnumValue("pre")
    PRE("pre"),
    @XmlEnumValue("final")
    FINAL("final");
    private final String value;

    AuthIndicatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthIndicatorEnum fromValue(String v) {
        for (AuthIndicatorEnum c: AuthIndicatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}