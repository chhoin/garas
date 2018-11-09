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
import com.smart.garas.service.CaptureService;

@Controller
public class CaptureController {
	@Autowired
	private CaptureService captureService;
	
	// show page 
	@RequestMapping("/capture")
	public String getCapturePage(){
		return "capture";
	}
	
	// get combo ឈ្មោះក្រុមហ៊ុន
	@RequestMapping(value="/api/capturecombosupplier", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDto> getComboSuppCompanys(){
		return captureService.getComboSuppCompany();
	}
	
	// get combo info ឈ្មោះអ្នកផ្គត់ផ្គង់  by ឈ្មោះក្រុមហ៊ុន
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
	
	// got combo ឈ្មោះមុខទំនិញ
	@RequestMapping(value="/api/capcombocategories", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getComboCategorys(){
		return captureService.getComboCategory();
	}
	
	// get combo Info ប្រភេទមុខទំនិញ by ឈ្មោះមុខទំនិញ
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
	
	// get combo ឯកតា
	@RequestMapping(value="/api/capturecomunit/{unitType}", method = RequestMethod.GET)
	@ResponseBody
	public List<UnitDto> getComboUnits(@PathVariable String unitType){
		return captureService.getComboUnit(unitType);
	}
	
	// get combo រូបិយប័ណ្ណ
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
