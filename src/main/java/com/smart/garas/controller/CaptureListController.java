package com.smart.garas.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.CaptureDto;
import com.smart.garas.dto.CaptureListDto;
import com.smart.garas.dto.CategoryDto;
import com.smart.garas.dto.SupplierDto;
import com.smart.garas.service.CaptureListService;

@Controller
public class CaptureListController {
	@Autowired
	private CaptureListService captureListService;
	
	// show page
	@RequestMapping("capturelist")
	public String getPageCaptureListPage(){
		return "capturelist";
	}
	
	// get combo of លេខវិក័យបត្រ
	@RequestMapping(value="/api/capturelistinvoiceno", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureDto> getComboInvoiceNos(){
		return captureListService.getComboInvoiceNo();
	}
	
	// get combo of ឈ្មោះអ្នកផ្គត់ផ្គង់
	@RequestMapping(value="/api/capturelistsuppliercode", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDto> getComboSupplierCodes(){
		return captureListService.getComboSupplierCode();
	}
	
	// get combo of លេខទូរស័ព្ទ
	@RequestMapping(value="/api/capturelistphone", method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDto> getComboSupplierPhones(){
		return captureListService.getComboSupplierPhone();
	}
	
	// get combo of ឈ្មោះមុខទំនិញ
	@RequestMapping(value="/api/capturelistcategory", method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDto> getComboCategoryCodes(){
		return captureListService.getComboCategoryCode();
	}
	
	// Search data from database
	@RequestMapping(value="/api/supcaptursearch/{fromDate},{toDate},{invoiceNo},{suppCode},{phone},{cateCode},{status},{currentPage},{numPerPage}", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureListDto> getSearchSupStoCap(
			@PathVariable("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
			@PathVariable String invoiceNo,
			@PathVariable String suppCode,
			@PathVariable String phone,
			@PathVariable String cateCode,
			@PathVariable String status,
			@PathVariable int currentPage,
			@PathVariable int numPerPage)
	{
		return captureListService.getSearchCapList(fromDate, toDate, invoiceNo, suppCode, phone, cateCode, status, currentPage, numPerPage);
	}
	
	// Print invoice
	@RequestMapping(value="/api/capturelistprintimport/{invoiceNo}", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureListDto> getPrintInvoiceImports(@PathVariable String invoiceNo)
	{
		return captureListService.getPrintInvoiceImport(invoiceNo);
	}
	
	// Export to excel file 
	@RequestMapping(value="/api/capturelistexcel/{dataString}", method = RequestMethod.GET)
	@ResponseBody
	public byte[] getExportExcels(@PathVariable String dataString)
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("../classes/templates/invoice.xlsx");
		try {
			// Parse data sting to JSON
			
			// Read data from json
			String invoiceNo = "";
			String customerName = "";
			String contact = "";
			
			Workbook wb = WorkbookFactory.create(is);
			Sheet sheet = wb.getSheet("Invoice Sheet");
			
			String customerInfo = sheet.getRow(7).getCell(0).getStringCellValue();
			String contactInfo = sheet.getRow(8).getCell(0).getStringCellValue();
			
			customerInfo = customerInfo.replace("${customerName}", customerName);
			contactInfo = contactInfo.replace("${phoneNumber}", contact);
			
			sheet.getRow(7).getCell(0).setCellValue(customerInfo);
			sheet.getRow(7).getCell(0).setCellValue(contactInfo);
			
			List<CaptureListDto> results = captureListService.getExportExcel(invoiceNo);
			
			
			// Write the output to a file
			File outPutFile = null;
		    try {
		    	outPutFile = File.createTempFile(invoiceNo, ".xlsx");
		    	OutputStream fileOut = new FileOutputStream(outPutFile);
		        wb.write(fileOut);
		    } catch (Exception e) {
				e.printStackTrace();
			}             
		    wb.close();
		    
		    if (outPutFile != null) {
		    	InputStream in = new FileInputStream(outPutFile);
		    	return IOUtils.toByteArray(in);
		    }
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new byte[0];
	}
	
	// Print now
	@RequestMapping(value="/api/capturelistprintnow/{invoiceNo}", method = RequestMethod.GET)
	@ResponseBody
	public List<CaptureListDto> getPrintNows(@PathVariable String invoiceNo)
	{
		return captureListService.getPrintNow(invoiceNo);
	}
	
}
