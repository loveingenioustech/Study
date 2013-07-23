//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.11 at 06:17:31 PM CST 
//


package juno.hibernate3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}subselect-element" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}comment" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}key"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}property"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}many-to-one"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}component"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}dynamic-component"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}any"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-insert" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-update" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-delete" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hibernate.org/xsd/hibernate-mapping}attlist.join"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subselectElement",
    "comment",
    "key",
    "propertyOrManyToOneOrComponent",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete"
})
@XmlRootElement(name = "join")
public class Join {

    @XmlElement(name = "subselect-element")
    protected String subselectElement;
    protected String comment;
    @XmlElement(required = true)
    protected Key key;
    @XmlElements({
        @XmlElement(name = "dynamic-component", type = DynamicComponent.class),
        @XmlElement(name = "component", type = Component.class),
        @XmlElement(name = "many-to-one", type = ManyToOne.class),
        @XmlElement(name = "any", type = Any.class),
        @XmlElement(name = "property", type = Property.class)
    })
    protected List<Object> propertyOrManyToOneOrComponent;
    @XmlElement(name = "sql-insert")
    protected SqlInsert sqlInsert;
    @XmlElement(name = "sql-update")
    protected SqlUpdate sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected SqlDelete sqlDelete;
    @XmlAttribute(name = "table", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String table;
    @XmlAttribute(name = "schema")
    @XmlSchemaType(name = "anySimpleType")
    protected String schema;
    @XmlAttribute(name = "catalog")
    @XmlSchemaType(name = "anySimpleType")
    protected String catalog;
    @XmlAttribute(name = "subselect")
    @XmlSchemaType(name = "anySimpleType")
    protected String subselect;
    @XmlAttribute(name = "fetch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fetch;
    @XmlAttribute(name = "inverse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inverse;
    @XmlAttribute(name = "optional")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optional;

    /**
     * Gets the value of the subselectElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselectElement() {
        return subselectElement;
    }

    /**
     * Sets the value of the subselectElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselectElement(String value) {
        this.subselectElement = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setKey(Key value) {
        this.key = value;
    }

    /**
     * Gets the value of the propertyOrManyToOneOrComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicComponent }
     * {@link Component }
     * {@link ManyToOne }
     * {@link Any }
     * {@link Property }
     * 
     * 
     */
    public List<Object> getPropertyOrManyToOneOrComponent() {
        if (propertyOrManyToOneOrComponent == null) {
            propertyOrManyToOneOrComponent = new ArrayList<Object>();
        }
        return this.propertyOrManyToOneOrComponent;
    }

    /**
     * Gets the value of the sqlInsert property.
     * 
     * @return
     *     possible object is
     *     {@link SqlInsert }
     *     
     */
    public SqlInsert getSqlInsert() {
        return sqlInsert;
    }

    /**
     * Sets the value of the sqlInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlInsert }
     *     
     */
    public void setSqlInsert(SqlInsert value) {
        this.sqlInsert = value;
    }

    /**
     * Gets the value of the sqlUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link SqlUpdate }
     *     
     */
    public SqlUpdate getSqlUpdate() {
        return sqlUpdate;
    }

    /**
     * Sets the value of the sqlUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlUpdate }
     *     
     */
    public void setSqlUpdate(SqlUpdate value) {
        this.sqlUpdate = value;
    }

    /**
     * Gets the value of the sqlDelete property.
     * 
     * @return
     *     possible object is
     *     {@link SqlDelete }
     *     
     */
    public SqlDelete getSqlDelete() {
        return sqlDelete;
    }

    /**
     * Sets the value of the sqlDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlDelete }
     *     
     */
    public void setSqlDelete(SqlDelete value) {
        this.sqlDelete = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the subselect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselect() {
        return subselect;
    }

    /**
     * Sets the value of the subselect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselect(String value) {
        this.subselect = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetch() {
        if (fetch == null) {
            return "join";
        } else {
            return fetch;
        }
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetch(String value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the inverse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInverse() {
        if (inverse == null) {
            return "false";
        } else {
            return inverse;
        }
    }

    /**
     * Sets the value of the inverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInverse(String value) {
        this.inverse = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptional() {
        if (optional == null) {
            return "false";
        } else {
            return optional;
        }
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptional(String value) {
        this.optional = value;
    }

}