package com.bonfiy3.main.constant;

import org.springframework.stereotype.Component;

@Component
public class Electricity implements DataTypes {

	@Override
	public String process() {
	
		System.out.println("processed electricity");
		return "processed electricity";
	}

}
