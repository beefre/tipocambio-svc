package org.bedu.sesion04.tipocambio.dao;

import org.bedu.sesion04.tipocambio.model.Combination;
import org.bedu.sesion04.tipocambio.model.Currency;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

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





}
