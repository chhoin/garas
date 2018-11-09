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
import com.smart.garas.dto.UnitDto;
import com.smart.garas.service.UnitService;

@Controller
public class UnitController {
	@Autowired
	private UnitService unitService;
	
	// get unit page
	@RequestMapping("/unit")
	public String gepPageUnit(){
		return "unit";
	}
	
	// save data
		@RequestMapping(value="/api/units", method = RequestMethod.POST)
		@ResponseBody
		public int save(@RequestBody UnitDto unit){
			return unitService.save(unit);
		}
		
		// get data all from database
		@RequestMapping(value="/api/units", method = RequestMethod.GET)
		@ResponseBody
		public List<UnitDto> getData(){
			return unitService.getAll();
		}
		
		// check duplicate data
		@RequestMapping(value="/api/units/existId", method = RequestMethod.GET)
		@ResponseBody
		public boolean checkUnit(@RequestParam String name){
			return unitService.countById(name) !=0;
		}
		
		/*delete data by code*/
		@RequestMapping(value="/api/unitsdelete/{categories_CODE}", method = RequestMethod.DELETE)
		@ResponseBody
		public int deleteUnits(@PathVariable String categories_CODE){
			return unitService.deleteById(categories_CODE);
		}
	
}
