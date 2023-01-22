package com.arun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arun.response.CaptchaResponse;
import com.arun.service.CaptchaService;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {
	@Autowired
	CaptchaService captchaService;
	
	 @PostMapping("/check")
	    public CaptchaResponse verify (@RequestParam(name="g-recaptcha-response") String siteresponse){
			return captchaService.verify(siteresponse);
	 }

}
