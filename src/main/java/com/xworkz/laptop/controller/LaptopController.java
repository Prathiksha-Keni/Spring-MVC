package com.xworkz.laptop.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Component
@RequestMapping("/")
public class LaptopController {

	public LaptopController() {
		System.out.println("Laptop bean created");
	}
	@RequestMapping("/login")
	public String OnSubmit(@RequestParam String laptopBrand,@RequestParam String laptopName,@RequestParam double laptopPrice,@RequestParam int laptopRam) {
		System.out.println("Invoked OnSubmit");
		System.out.println(laptopBrand);
		System.out.println(laptopName);
		System.out.println(laptopPrice);
		System.out.println(laptopRam);
	
		return "/WEB-INF/laptop.html";
	}
	
//	@RequestMapping("/one")
//	public String methodOne() {
//		System.out.println("Invoked methodOne");
//		return "/WEB-INF/image.jpg";
//	}
//	@RequestMapping("/two")
//	public String methodTwo() {
//		System.out.println("Invoked methodTwo");
//		return "/WEB-INF/textSample.txt";
//	}
//	@RequestMapping("/three")
//	public void methodThree() {
//		System.out.println("Invoked methodThree");
//	}
//	@RequestMapping("/four")
//	public void methodFour() {
//		System.out.println("Invoked methodFour");
//	}
//	@RequestMapping("/five")
//	public void methodFive() {
//		System.out.println("Invoked methodFive");
//	}
//	@RequestMapping("/six")
//	public void methodSix() {
//		System.out.println("Invoked methodSix");
//	}

}
