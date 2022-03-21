package com.xworkz.laptop.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class LaptopController {

	public LaptopController() {
		System.out.println("Laptop bean created");
	}
	@RequestMapping("/one")
	public String methodOne() {
		System.out.println("Invoked methodOne");
		return "/WEB-INF/image.jpg";
	}
	@RequestMapping("/two")
	public String methodTwo() {
		System.out.println("Invoked methodTwo");
		return "/WEB-INF/textSample.txt";
	}
	@RequestMapping("/three")
	public void methodThree() {
		System.out.println("Invoked methodThree");
	}
	@RequestMapping("/four")
	public void methodFour() {
		System.out.println("Invoked methodFour");
	}
	@RequestMapping("/five")
	public void methodFive() {
		System.out.println("Invoked methodFive");
	}
	@RequestMapping("/six")
	public void methodSix() {
		System.out.println("Invoked methodSix");
	}

}
