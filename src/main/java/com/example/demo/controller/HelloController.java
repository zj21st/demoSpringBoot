/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suman
 * @Description: XXXXXXX
 * @date 2017年11月24日
 */


@RestController
public class HelloController {
	
	@Value("${book.name}")
	private String bookname;

	@RequestMapping("/hello")
	public String index() {
		return "Hello World  "+bookname;
	}
	
	
	@RequestMapping("/hello2")
	public String index2() {
		return "Hello World2";
	}
}
