package com.hrportal.main.constant;

public enum DataTypesEnum {

	ELECTRICTY("Electricity", Electricity.class), DSL("Dsl", Dsl.class),
	APARTMENT_RENT("Apartment", ApartmentRent.class);

	Class  clazz;
	String name;

	DataTypesEnum(String name, Class clazz) {
		this.clazz = clazz;
		this.name  = name;
	}

	public static DataTypesEnum findbyName(String name) {
		for (DataTypesEnum denum : DataTypesEnum.values()) {
			 if(denum.name.equals(name))
			 return denum;
		}
		return null;
	}
}
