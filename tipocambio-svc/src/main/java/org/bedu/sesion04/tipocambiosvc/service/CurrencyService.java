package org.bedu.sesion04.tipocambio.service;

import org.bedu.sesion04.tipocambio.dao.CurrencyDAO;
import org.bedu.sesion04.tipocambio.model.Combination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CurrencyService {

    private CurrencyDAO currencyDAO;

    @Autowired
    public CurrencyService(CurrencyDAO currencyDAO){
        this.currencyDAO = currencyDAO;
    }

    public Map<String , List<Combination>> getAll(){
        return currencyDAO.getAll();
    }
}
