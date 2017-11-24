/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suman
 * @Description: XXXXXXX
 * @date 2017年11月24日
 */


@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
	
	
	@RequestMapping("/hello2")
	public String index2() {
		return "Hello World2";
	}
}
