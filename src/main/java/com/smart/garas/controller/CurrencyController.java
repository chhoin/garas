package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.service.CurrencyService;

@Controller
public class CurrencyController {
	
	@Autowired
	private CurrencyService currencyService;
	
	@RequestMapping("/currency")
	public String getCurrencyPage(){
		return "currency";
	}
	
	@RequestMapping(value="/api/currencys", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody CurrencyDto currency){
		return currencyService.save(currency);
	}
	
	@RequestMapping(value="/api/currencys", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getData(){
		return currencyService.getAll();
	}
	
	@RequestMapping(value="/api/currencys/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkCurrency(@RequestParam String name){
		return currencyService.countById(name) !=0;
	}
	
}
