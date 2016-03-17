
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.result.ApiGetDepartmentUserIdsResult;


/**
 * <p>Java class for getDepartmentUserIdsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDepartmentUserIdsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://result.apiservice.bullhorn.com/}apiGetDepartmentUserIdsResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDepartmentUserIdsResponse", propOrder = {
    "_return"
})
public class GetDepartmentUserIdsResponse {

    @XmlElement(name = "return")
    protected ApiGetDepartmentUserIdsResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGetDepartmentUserIdsResult }
     *     
     */
    public ApiGetDepartmentUserIdsResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGetDepartmentUserIdsResult }
     *     
     */
    public void setReturn(ApiGetDepartmentUserIdsResult value) {
        this._return = value;
    }

}