package org.bedu.sesion04.tipocambiosvc.dao;


import org.bedu.sesion04.tipocambiosvc.model.Combination;
import org.bedu.sesion04.tipocambiosvc.model.Currency;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CurrencyDAO {
//
//    1 peso son 0.056 USD
//    1 peso son 0.052 EU
//
//    1 usd son 17.85 pesos
//    1 eu son 19.23 pesos
//
//    1 usd son 0.93
//    1 eu son 1.07

   public Map<String , List<Combination>> getAllExchanges(){
       return Currency.getExchanges();
   }

   public Set getAllCurrencies(){return Currency.getCurrencies();}


    public List<Combination> getExchangeByName(String name, Double money) {

        return Currency.getExchanges().get(name).stream().map(m-> new Combination(m.getName(), Double.valueOf(m.getValue())*money)).collect(Collectors.toList());

        //return Currency.getExchanges().get(name).stream().map(m->Double.valueOf(m.getValue())*money).collect(Collectors.toList());
    }
}
