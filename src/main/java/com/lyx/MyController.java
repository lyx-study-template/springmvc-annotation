package com.lyx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
	@GetMapping("/foo")
	public String foo(Model model)
	{
		model.addAttribute("msg","这一个字符串");

		return "test";
	}
}