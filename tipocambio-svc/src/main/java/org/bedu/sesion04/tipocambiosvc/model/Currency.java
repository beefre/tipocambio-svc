package org.bedu.sesion04.tipocambio.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Currency {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private static Map<String , List<Combination>> exchanges;
    static{
        exchanges.put("MXN", Arrays.asList(new Combination("USD","0.056"),new Combination("EUR","0.052")));
        exchanges.put("USD", Arrays.asList(new Combination("MXP", "17.85"), new Combination("EUR", "0.93")));
        exchanges.put("EUR", Arrays.asList(new Combination("MXP", "19.23"), new Combination("USD", "1.07")));
    };

    public static Map<String, List<Combination>> getExchange() {
        return exchanges;
    }

}
