
package team17.sheet09.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AddResponse complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="AddResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddResponse", propOrder = {
        "_return"
})
public class AddResponse {

    @XmlElement(name = "return")
    protected int _return;

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     */
    public int getReturn() {
        return _return;
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     */
    public void setReturn(int value) {
        this._return = value;
    }

}
