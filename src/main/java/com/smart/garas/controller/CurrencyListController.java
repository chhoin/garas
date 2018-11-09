package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.service.CurrencyListService;

@Controller
public class CurrencyListController {
	@Autowired
	private CurrencyListService currencyListService;
	
	@RequestMapping("/currencylist")
	public String getPageCurrencyListPage(){
		return "currencylist";
	}
	
	/* save data to database */
	@RequestMapping(value="/api/currencylists", method = RequestMethod.POST)
	@ResponseBody
	public int save(@RequestBody CurrencyDto currency){
		return currencyListService.save(currency);
	}
	
	/*get data all*/
	@RequestMapping(value="/api/currencylists", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getData(){
		return currencyListService.getAll();
	}
	
	/*get data by name (search)*/
	@RequestMapping(value="/api/currencylistsbycode/{cur_NAME}", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getDataListByCode(@PathVariable String cur_NAME){
		return currencyListService.getListByCode(cur_NAME);
	}
	
	/*get data to combo box*/
	@RequestMapping(value="/api/currencylistscombos", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getDataToCombo(){
		return currencyListService.getDataToCombo();
	}
	
	/*check exit data*/
	@RequestMapping(value="/api/currencylists/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkCurrency(@RequestParam String name){
		return currencyListService.countById(name) !=0;
	}
	
	/*edit data by code*/
	/*@RequestMapping(value="/api/currencylists/{coaCode}", method = RequestMethod.PUT)
	@ResponseBody
	public int editCurrency(@RequestBody CurrencyDto urrency, @PathVariable String coaCode){
		urrency.setCur_NAME(coaCode);
		return currencyListService.editById(urrency);
	}
	*/
	/*delete data by code*/
	@RequestMapping(value="/api/currencylistsdelete/{cur_NAME}", method = RequestMethod.DELETE)
	@ResponseBody
	public int deleteCurrency(@PathVariable String cur_NAME){
		return currencyListService.deleteById(cur_NAME);
	}

}
