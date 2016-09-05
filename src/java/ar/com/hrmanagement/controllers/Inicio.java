package ar.com.hrmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.hrmanagement.service.DevolverAlgoService;

@Controller
public class Inicio {

	
	@Autowired
	DevolverAlgoService devolverAlgoService;
	
	@RequestMapping("prueba")
	public ModelAndView prueba(){
		
		
		ModelAndView mav = new ModelAndView("hola");
		mav.addObject("algo",devolverAlgoService.dameAlgo());
		System.out.println(devolverAlgoService.dameAlgo());
		return mav;
		
	}
	
}
