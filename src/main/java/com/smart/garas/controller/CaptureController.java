package com.smart.garas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CarDto;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.PaymentDto;
import com.smart.garas.dto.ProductInfoDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.impl.CaptureServiceImpl;

@Controller
public class CaptureController {
	@Autowired
	private CaptureServiceImpl captureService;	
	
	// show page 
	@RequestMapping("/capture")
	public String getCapturePage(){
		return "capture";
	}
	
	// get combo �엳�윊�옒�웶�웻���윊�옔�왊�옒�옞�웿�왊�옋
	@RequestMapping(value="/api/capturecombosupplier", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDto> getComboSuppCompanys(){
		return captureService.getComboSuppCompany();
	}
	
	// get combo info �엳�윊�옒�웶�웻�옠�윊�옋���옎�윊�엩�옃�윀�옎�윊�엩�엫�윀  by �엳�윊�옒�웶�웻���윊�옔�왊�옒�옞�웿�왊�옋
	@RequestMapping(value="/api/capturecombosuppinfo/{suppCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDto> getComboSuppNames(@PathVariable String suppCode){
		return captureService.getComboSuppName(suppCode);
	}
	
	// Get combo of car number
	@RequestMapping(value="/api/capcombocarnumber", method = RequestMethod.GET)
	@ResponseBody
	public List<CarDto> getCarNums(){
		return captureService.getCarNum();
	}
	
	// Get combo driver name by car code
	@RequestMapping(value="/api/capturecombodrivername/{carCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<CarDto> getDriverNames(@PathVariable String carCode){
		return captureService.getDriverName(carCode);
	}
	
	// got combo �엳�윊�옒�웶�웻�옒�왊�엨�옉�웺�옋�왅�엵
	@RequestMapping(value="/api/capcombocategories", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getComboCategorys(){
		return captureService.getComboCategory();
	}
	
	// get combo Info �옍�윊�옔�옑�웳�옉�옒�왊�엨�옉�웺�옋�왅�엵 by �엳�윊�옒�웶�웻�옒�왊�엨�옉�웺�옋�왅�엵
	@RequestMapping(value="/api/capcombocategoriesinfo/{cateCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductInfoDto> getComboCategoryInfos(@PathVariable String cateCode){
		return captureService.getComboCategoryInfo(cateCode);
	}
	
	// save Import Products
	@RequestMapping(value="/api/captures", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody CaptureDto capture){
		return captureService.save(capture);
	}
	
	// save Import Payment
	@RequestMapping(value="/api/saveimportpayment", method = RequestMethod.POST)
	@ResponseBody
	public Integer saveImportPayment(@RequestBody PaymentDto paymentDto){
		return captureService.saveImportPayment(paymentDto);
	}
	
	// get combo �옸���옃�왃
	@RequestMapping(value="/api/capturecomunit/{unitType}", method = RequestMethod.GET)
	@ResponseBody
	public List<UnitDto> getComboUnits(@PathVariable String unitType){
		return captureService.getComboUnit(unitType);
	}
	
	// get combo �옔�왋�옍�왅�옓�옍�윇�옂�윊�옂
	@RequestMapping(value="/api/capturecomboccy", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getComboCcys(){
		return captureService.getComboCcy();
	}
	
	// Search data Import Product Print
	@RequestMapping(value="/api/capturesearchprint/{invoiceNo},{curCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureListDto> getSearchCapturePrints(
			@PathVariable String invoiceNo,
			@PathVariable String curCode)
	{
		return captureService.getSearchCapturePrint(invoiceNo, curCode);
	}

}
