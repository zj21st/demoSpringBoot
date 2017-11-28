/**
 * 
 */
package com.example.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suman
 * @Description: XXXXXXX
 * @date 2017年11月24日
 */


@RestController
public class HelloController {
	
	private  final Logger  logger = Logger.getLogger(getClass());
	
	@Autowired
	private DiscoveryClient clinet;
	
	@Value("${book.name}")
	private String bookname;

	@RequestMapping("/hello")
	public String index() {
		ServiceInstance instance = clinet.getLocalServiceInstance();
		logger.info("/host host:"+instance.getHost()+",service_id: "+instance.getServiceId());
		return "Hello World  "+bookname;
	}
	
	
	@RequestMapping("/hello2")
	public String index2() {
		return "Hello World2";
	}
}
