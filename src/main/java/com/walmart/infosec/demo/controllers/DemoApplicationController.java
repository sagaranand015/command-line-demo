/**
 * 
 */
package com.walmart.infosec.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.walmart.infosec.demo.utils.DemoUtil;

/**
 * @author sanand5
 */
@Controller
@RequestMapping(value = "/")
public class DemoApplicationController {

	@Autowired
	DemoUtil demoUtil;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void indexMethod(ModelMap model) {

		String domainName = "google.com";

		// in mac oxs
		String command = "ping -c 3 " + domainName;

		// in windows
		// String command = "ping -n 3 " + domainName;

		String output = demoUtil.executeCommand(command);
		System.out.println(output);

	}

}
