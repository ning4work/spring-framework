package com.ning.service.impl;

import com.ning.service.FirstService;

public class FirstServiceImpl implements FirstService {


	@Override
	public void printName(String name) {
		System.out.println(name);
	}
}
