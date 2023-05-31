package org.bedu.sesion04.tipocambiosvc.model;



public class Combination {


    private String name;
    private Double value;


    public Combination(String name, Double values) {
        this.name = name;
        this.value = values;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
