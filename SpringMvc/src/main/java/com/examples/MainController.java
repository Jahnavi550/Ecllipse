package com.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller
public class MainController
{
	@RequestMapping("/h1")
	public String getMessage()
	{
		return "test";
	}
}
