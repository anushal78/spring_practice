package com.example.practice;
import org.springframework.sterotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("Bike is riding");
	}
}
