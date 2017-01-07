
package com.sap.xi.ap.common.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.ProjectElementID;


/**
 * <p>Java class for ProjectTaskKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectTaskKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskID" type="{http://sap.com/xi/AP/Common/GDT}ProjectElementID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTaskKey", propOrder = {
    "taskID"
})
public class ProjectTaskKey {

    @XmlElement(name = "TaskID", required = true)
    protected ProjectElementID taskID;

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectElementID }
     *     
     */
    public ProjectElementID getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectElementID }
     *     
     */
    public void setTaskID(ProjectElementID value) {
        this.taskID = value;
    }

}
