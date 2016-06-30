package com.tomato.framework.log.support;

/**
 * @author Hunhun
 */
public class Operation {

    private Object key;

    private Object value;

    private Operator operator;


    public Operation() {
    }

    public Operation(Object key, Object value, Operator operator) {
        this.key = key;
        this.value = value;
        this.operator = operator;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

}
