package com.bonfiy3.main.constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DataTypeFactory {

	@Autowired
	ApplicationContext context;

	public DataTypes getDataType(DataTypesEnum enumdata) {

		return (DataTypes) context.getBean(enumdata.clazz);

	}

}
