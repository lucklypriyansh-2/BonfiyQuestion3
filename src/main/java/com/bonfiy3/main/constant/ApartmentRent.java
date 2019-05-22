package com.bonfiy3.main.constant;

import org.springframework.stereotype.Component;

@Component
public class ApartmentRent implements DataTypes{

	@Override
	public String process() {
	
		System.out.println("processed apartment");
		return "processed apartment";
	}

}
