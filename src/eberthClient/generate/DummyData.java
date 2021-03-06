
package eberthClient.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse f�r dummyData complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="dummyData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="mText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mTime" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dummyData", propOrder = {
    "mText",
    "mTime"
})
public class DummyData {

    protected String mText;
    protected long mTime;

    /**
     * Ruft den Wert der mText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMText() {
        return mText;
    }

    /**
     * Legt den Wert der mText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMText(String value) {
        this.mText = value;
    }

    /**
     * Ruft den Wert der mTime-Eigenschaft ab.
     * 
     */
    public long getMTime() {
        return mTime;
    }

    /**
     * Legt den Wert der mTime-Eigenschaft fest.
     * 
     */
    public void setMTime(long value) {
        this.mTime = value;
    }

}
