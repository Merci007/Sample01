package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringTestController {

	//ホーム画面(localhost:8080/で呼び出される。)
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main/homeTest");
		return mv;
	}
}

