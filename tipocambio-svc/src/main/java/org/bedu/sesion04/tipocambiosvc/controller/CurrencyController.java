package org.bedu.sesion04.tipocambio.controller;

import org.bedu.sesion04.tipocambio.model.Currency;
import org.bedu.sesion04.tipocambio.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyController {

    private CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService){
        this.currencyService = currencyService;
    }

//    @GetMapping("/currencies")
//    public List<Currency> getCurrencies(){
//
//        return currencyService.getAll().get("MXN");
//    }

    @GetMapping("/currencies/{name}")
    public ResponseEntity<String> getCurrencies(@PathVariable("name") String name){

        return (ResponseEntity<String>) currencyService.getAll().get(name);

    }
}
