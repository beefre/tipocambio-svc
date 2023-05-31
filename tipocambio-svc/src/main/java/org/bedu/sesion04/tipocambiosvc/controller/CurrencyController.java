package org.bedu.sesion04.tipocambiosvc.controller;


import org.bedu.sesion04.tipocambiosvc.model.Combination;
import org.bedu.sesion04.tipocambiosvc.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class CurrencyController {

    private CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService){
        this.currencyService = currencyService;
    }

    @GetMapping("/currencies")
    public Set getCurrencies(){
        return currencyService.getAllCurrencies();
    }

    @GetMapping("/currencies/{name}")
    public List<Combination> getCurrencyExchanges(@PathVariable("name") String name){
        return  currencyService.getAllExchanges().get(name).stream().collect(Collectors.toList());
    }


}
