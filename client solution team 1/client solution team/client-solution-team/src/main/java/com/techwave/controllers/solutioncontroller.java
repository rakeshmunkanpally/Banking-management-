package com.techwave.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.techwave.urls;
import com.techwave.controllers.models.DTO.location;

import jakarta.validation.Valid;


@Controller



public class solutioncontroller {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/filter")
	public String filterd(Model M) {
		location location=new location();
		M.addAttribute("location", location);
		return "firstfilter";
	}
	
	@RequestMapping("/validate")
	public String filters(@Valid @ModelAttribute("location") location l ,BindingResult bs,Model M) {
		if(bs.hasErrors()) {
			return "firstfilter";
		}
		else {
			
			List<String> result=restTemplate.getForEntity(urls.getsecondrydetails, List.class,Map.of("primaryCategoryId",l.getPrimaryCategoryId())).getBody();
			M.addAttribute("SecondaryDesc", result);
			return "demo";
		}
		
	}
	
	

}
