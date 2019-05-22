package com.bonfiy3.main.constant;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dsl implements DataTypes {

	@Override
	public String process() {
		System.out.println("processed dsl");
		return "processed dsl";
		
	}

}
