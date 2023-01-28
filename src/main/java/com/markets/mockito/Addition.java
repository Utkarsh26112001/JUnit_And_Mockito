package com.markets.mockito;

public class Addition {
	AdditionService obj;
	public Addition(AdditionService service) {
		// TODO Auto-generated constructor stub
		this.obj = service;
	}
	public int addition(int a, int b) {
		return obj.addition(a, b);
	}
}
