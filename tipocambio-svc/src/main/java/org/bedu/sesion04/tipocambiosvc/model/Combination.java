package org.bedu.sesion04.tipocambiosvc.model;



public class Combination {


    private String name;
    private String value;


    public Combination(String name, String values) {
        this.name = name;
        this.value = values;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
