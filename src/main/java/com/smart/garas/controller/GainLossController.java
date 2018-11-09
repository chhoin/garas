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
import com.smart.garas.dto.GainLossDto;
import com.smart.garas.service.GainLossService;

@Controller
public class GainLossController {
	@Autowired
	private GainLossService gainLossService;
	
	// shoe page GainLoss
	@RequestMapping("/gainloss")
	public String getGainLossPage(){
		return "gainloss";
	}
	
	// Search GainLoss by Date
	@RequestMapping(value="/api/getsearchgainlosseds/{p_DATE_FROM},{p_DATE_TO}", method = RequestMethod.GET)
	@ResponseBody
	public List<GainLossDto> getSearchGainLossed(
			@PathVariable("p_DATE_FROM") @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_DATE_FROM,
			@PathVariable("p_DATE_TO") @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_DATE_TO)
	{
		return gainLossService.getSearchGainLoss(p_DATE_FROM, p_DATE_TO);
	}
	
}
