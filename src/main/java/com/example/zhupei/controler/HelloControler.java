package com.example.zhupei.controler;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.zhupei.model.Cat;
import com.example.zhupei.model.Person;
import com.example.zhupei.service.TestService;

@SessionAttributes(value= {"bb"})
@Controller
@RequestMapping("/test")
public class HelloControler {
	
	@Autowired
	private TestService test;
	
	@Autowired
	public Cat cat;
	
	@Autowired
	public Person p;
	
	@GetMapping("hello22")
	@ResponseBody
	public Cat hello() {
		
		return cat;
	}
 
	@GetMapping("person")
	@ResponseBody
	public Person person() {
		
		return p;
	}
	
	@GetMapping("request")
	@ResponseBody
	public String RequestTest(@RequestParam(required=true,value="aa") String aa,Map<String, Object> map,HttpSession hs) {
		hs.setAttribute("cc", "bb");
		map.put("bb", aa);
		String ee=(String) hs.getAttribute("bb");
		return ee;
	}
	
	@GetMapping("sqltest")
	@ResponseBody
	public Object sqltest() {
		return test.findBookScore();
	}
}
