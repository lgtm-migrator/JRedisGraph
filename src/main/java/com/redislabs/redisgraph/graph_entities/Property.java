package com.redislabs.redisgraph.graph_entities;

import com.redislabs.redisgraph.ResultSet;

import java.util.Objects;

/**
 * A Graph entity property. Has a name, type, and value
 */
public class Property {

    //members
    private String name;
    private ResultSet.ResultSetScalarTypes type;

    private ResultSet.ResultSetValueTypes valueType;
    private Object value;


    /**
     * Default constructor
     */
    public Property() {

    }

    /**
     * Parameterized constructor
     *
     * @param name
     * @param type
     * @param value
     */
    @Deprecated
    public Property(String name, ResultSet.ResultSetScalarTypes type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public Property(String name, ResultSet.ResultSetValueTypes type, Object value) {
        this.name = name;
        this.valueType = type;
        this.value = value;
    }

    //getters & setters

    /**
     * @return property name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name - property name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return property type
     */
    @Deprecated
    public ResultSet.ResultSetScalarTypes getType() {
        return type;
    }

    /**
     * @param type property type to be set
     */
    @Deprecated
    public void setType(ResultSet.ResultSetScalarTypes type) {
        this.type = type;
    }

    /**
     * @return property type
     */
    public ResultSet.ResultSetValueTypes getValueType() {return valueType;}


    /**
     * @param type property type to be set
     */
    public void setValueType(ResultSet.ResultSetValueTypes type) {
        this.valueType = type;
    }


    /**
     * @return property value
     */
    public Object getValue() {
        return value;
    }


    /**
     * @param value property value to be set
     */
    public void setValue(Object value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property = (Property) o;
        return Objects.equals(name, property.name) &&
                valueType == property.valueType &&
                Objects.equals(value, property.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, valueType, value);
    }

    /**
     * Default toString implementation
     * @return
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Property{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type=").append(valueType);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
