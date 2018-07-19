package com.fil.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "/logs", method = RequestMethod.GET)
	// @ResponseBody
	public String getHello() {
		return "login";
	}

	@RequestMapping(value = "/logs", method = RequestMethod.POST)
	// @ResponseBody
	public String postHello(@RequestParam String name, ModelMap map) {
		map.put("myData", name);
		return "login";
	}

}
