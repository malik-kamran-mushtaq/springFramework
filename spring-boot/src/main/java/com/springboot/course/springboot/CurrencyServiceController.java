package com.springboot.course.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyServiceController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;
    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration getCurrencyService() {
        return currencyServiceConfiguration;
    }
}
