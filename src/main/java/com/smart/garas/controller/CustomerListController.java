package com.smart.garas.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CustomerListDto;
import com.smart.garas.service.CustomerListService;

@Controller
public class CustomerListController {
	@Autowired
	private CustomerListService customerListService;
	
	// Show customer list page
	@RequestMapping("customerlist")
	public String getCustomerListPage(ModelMap model){
		List<CustomerListDto> result = customerListService.getCountTotalPage("","","");
		int totalPage = 0;
		if (result.size() > 0) {
			totalPage = result.get(0).getTotalPage();
		}
		
		model.addAttribute("totalPage", totalPage);

		return "customerlist";
	}
	
	// search data
	@RequestMapping(value="/api/customerlists/{custCode},{phone},{address},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Map<String,Object>> getSearchCustomers(
				@PathVariable String custCode,
				@PathVariable String phone,
				@PathVariable String address,
				@PathVariable int currentPage,
				@PathVariable int numPerPage
			)
	{		
		List<CustomerListDto> customerList = customerListService.getSearchCustomer(custCode, phone, address, currentPage, numPerPage);
		Map<String , Object> map = new HashMap<String , Object>();
		
		if (customerList.size() > 0) {
			map.put("result", true);
			map.put("DATA", customerList);
			// map.put("totalPage", customerListService.getCountTotalPage(numPerPage));
			map.put("totalPage", customerListService.getCountTotalPage(custCode, phone, address));
		} else {
			map.put("result", false);
			map.put("DATA", 	customerList);
			map.put("totalPage", "0.0");
		}		
		 return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
	}
	
	// delete data
	@RequestMapping(value="/api/customerlistdelete/{custCode}", method = RequestMethod.DELETE)
	@ResponseBody
	public int deleteCustomer(@PathVariable String custCode){
		return customerListService.deleteById(custCode);
	}
	
	// get data to combo box
	@RequestMapping(value="/api/customerlistcomboname", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerListDto> getDataComboNames(){
		return customerListService.getCustomerComboName();
	}
	
	// get data to combo box
	@RequestMapping(value="/api/customerlistcombophone", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerListDto> getDataComboPhones(){
		return customerListService.getCustomerComboPhone();
	}
	
	// get data to combo box
	@RequestMapping(value="/api/customerlistcombovillage", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerListDto> getDataComboVillages(){
		return customerListService.getCustomerComboVillage();
	}
	
	// Get count total page
	@RequestMapping(value="/api/customerlisttotalpage/{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerListDto> getCountTotalPages(
			@PathVariable String custCode,
			@PathVariable String phone,
			@PathVariable String address
	){
		return customerListService.getCountTotalPage(custCode, phone, address);
	}

}
