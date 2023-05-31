package org.bedu.sesion04.tipocambiosvc.service;


import org.bedu.sesion04.tipocambiosvc.dao.CurrencyDAO;
import org.bedu.sesion04.tipocambiosvc.model.Combination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class CurrencyService {

    private CurrencyDAO currencyDAO;

    @Autowired
    public CurrencyService(CurrencyDAO currencyDAO){
        this.currencyDAO = currencyDAO;
    }

    public Map<String , List<Combination>> getAllExchanges(){
        return currencyDAO.getAllExchanges();
    }

    public Set getAllCurrencies(){return currencyDAO.getAllCurrencies();}
}
