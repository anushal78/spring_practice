package com.example.practice;

import org.springframework.sterotype.Component;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired
	private Tyre tyre;
	
	
	//getter and setter
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}



	public void drive () 
	{
//		System.out.println("car is driving");
		System.out.println("car" + tyre);
	}

}
