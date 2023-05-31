package org.bedu.sesion04.tipocambiosvc.dao;


import org.bedu.sesion04.tipocambiosvc.model.Combination;
import org.bedu.sesion04.tipocambiosvc.model.Currency;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

   public Map<String , List<Combination>> getAll(){
       return Currency.getExchange();
   }

   public Set getAllCurrencies(){return Currency.getCurrencies();}





}
