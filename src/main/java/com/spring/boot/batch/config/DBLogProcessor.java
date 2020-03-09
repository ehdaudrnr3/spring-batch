package com.spring.boot.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.spring.boot.batch.models.Hotels;

public class DBLogProcessor implements ItemProcessor<Hotels, Hotels>{

	@Override
	public Hotels process(Hotels Hotel) throws Exception {
		 System.out.println("Inserting Hotels : " + Hotel);
	     return Hotel;
	}

}
