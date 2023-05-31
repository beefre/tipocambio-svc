package org.bedu.sesion04.tipocambiosvc.model;

import java.util.*;

public class Currency {

    private static Map<String , List<Combination>> exchanges = new HashMap<>();
    static{
        exchanges.put("MXN", Arrays.asList(new Combination("USD","0.056"),new Combination("EUR","0.052")));
        exchanges.put("USD", Arrays.asList(new Combination("MXP", "17.85"), new Combination("EUR", "0.93")));
        exchanges.put("EUR", Arrays.asList(new Combination("MXP", "19.23"), new Combination("USD", "1.07")));
    };

    private static Set currencies = new HashSet<>();

    static {
        currencies.add("MXN");
        currencies.add("EUR");
        currencies.add("USD");
    }

    public static Set getCurrencies(){
        return currencies;
    }

    public static Map<String, List<Combination>> getExchange() {
        return exchanges;
    }

}
