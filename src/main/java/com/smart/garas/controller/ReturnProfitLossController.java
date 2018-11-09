package com.smart.garas.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.ReturnProFitLossDto;
import com.smart.garas.service.ReturnProFitLossService;

@Controller
public class ReturnProfitLossController {
	@Autowired
	private ReturnProFitLossService returnProFitLossService;
	
	// get page show
	@RequestMapping("/returnprofitloss")
	public String getReturnProfitLossPage(){
		return "returnprofitloss";
	}
	
	// get data all from database
	@RequestMapping(value="/api/returnprofitlosss", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturnProFitLossDto> getAlls(){
		return returnProFitLossService.getAll();
	}
	
	
	// get combo of invoice supplier stock caputre
	@RequestMapping(value="/api/getcomboreturnprofitloss", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturnProFitLossDto> returnProFitLossServices(){
		return returnProFitLossService.getComBoReturnProFitLoss();
	}
	
	// Search
	@RequestMapping(value="/api/getsearchreturnprofitlos/{p_DATE_FROM},{p_DATE_TO},{p_INVOICE_NO}", method = RequestMethod.GET)
	@ResponseBody
	public List<ReturnProFitLossDto> getSearchReturnProFitLosss(
			@PathVariable("p_DATE_FROM") @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_DATE_FROM,
			@PathVariable("p_DATE_TO") @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_DATE_TO,
			@PathVariable String p_INVOICE_NO)
	{
		return returnProFitLossService.getSearchReturnProFitLoss(p_DATE_FROM, p_DATE_TO, p_INVOICE_NO);
	}
	
	/*
	 * p_DATE_FROM
	   p_DATE_TO
	   p_INVOICE_NO
	 */
	
}
