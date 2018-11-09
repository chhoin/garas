package com.smart.garas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherCaptureController {
	@RequestMapping("/othercapture")
	public String getOtherCapturePage(){
		return "othercapture";
	}

}
