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
import com.smart.garas.dto.CurrencyDto;
import com.smart.garas.dto.CustomerCaptureDto;
import com.smart.garas.dto.CustomerDto;
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.CustomerCaptureService;

@Controller
public class CustomerCaptureController {
	@Autowired
	private CustomerCaptureService customerCaptureService;
	
	// show page
	@RequestMapping("/customercapture")
	public String getCustomerCapturePage(){
		return "customercapture";
	}
	
	// Get cuscapInvoiceNo
	@RequestMapping(value="/api/customercaptureinvoicenocode", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerCaptureDto> getCusCapInvoiceNoCodes(){
		return customerCaptureService.getCusCapInvoiceNoCode();
	}
	
	// get combo ឈ្មោះអតិថិជន​ ***
	@RequestMapping(value="/api/customercapturecustomer", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerDto> getComboCustomerCodes(){
		return customerCaptureService.getComboCustomerCode();
	}
	
	// get combo Info ប្រភេទមុខទំនិញ by ឈ្មោះមុខទំនិញ
	@RequestMapping(value="/api/customercapturecustomerinfo/{custCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerDto> getComboCustomerInfos(@PathVariable String custCode){
		return customerCaptureService.getComboCustomerInfo(custCode);
	}
	
	// get combo លេខវិក័យបត្រ ​ ***
	@RequestMapping(value="/api/customercaptureinvoiceimp", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureDto> getComboInvoiceCodes(){
		return customerCaptureService.getComboInvoiceCode();
	}
	
	// get combo info លេខវិក័យបត្រ ​ ***
	@RequestMapping(value="/api/customercaptureinvoiceimpinfo/{invoiceNo}", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureListDto> getComboInvoiceInfos(@PathVariable String invoiceNo){
		return customerCaptureService.getComboInvoiceInfo(invoiceNo);
	}
	
	// get combo category code ***
	@RequestMapping(value="/api/customercapturecategory/{invoiceNo}", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureListDto> getComboCategoryByInvoiceImps(@PathVariable String invoiceNo){
		return customerCaptureService.getComboCategoryByInvoiceImp(invoiceNo);
	}
	
	// get combo product code ***
	@RequestMapping(value="/api/customercaptureproduct/{invoiceNo},{cateCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureListDto> getComboProdTypeByInvoiceImps(@PathVariable String invoiceNo, @PathVariable String cateCode){
		return customerCaptureService.getComboProdTypeByInvoiceImp(invoiceNo,cateCode);
	}
	
	// get combo ឯកតា ​ ***
	@RequestMapping(value="/api/customercaptureunit", method = RequestMethod.GET)
	@ResponseBody
	public List<UnitDto> getComboUnits(){
		return customerCaptureService.getComboUnit();
	}
	
	// get combo ផ្លាកលេខឡាន ​ ***
	@RequestMapping(value="/api/customercapturecar", method = RequestMethod.GET)
	@ResponseBody
	public List<CarDto> getComboCars(){
		return customerCaptureService.getCar();
	}
	
	// get combo info ផ្លាកលេខឡាន ​ ***
	@RequestMapping(value="/api/customercapturecarinfo/{carCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<CarDto> getCarInfos(@PathVariable String carCode){
		return customerCaptureService.getCarInfo(carCode);
	}
	
	// get combo រូបិយប័ណ្ណ
	@RequestMapping(value="/api/customercaptureccy", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyDto> getComboCcys(){
		return customerCaptureService.getComboCcy();
	}
	
	// Save data into database
	@RequestMapping(value="/api/customercapturesave", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody CustomerCaptureDto customerCaptureDto){
		return customerCaptureService.save(customerCaptureDto);
	}
}
