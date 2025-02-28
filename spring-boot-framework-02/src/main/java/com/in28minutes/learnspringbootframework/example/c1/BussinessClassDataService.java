package com.in28minutes.learnspringbootframework.example.c1;

import java.util.Arrays;

public class BussinessClassDataService {
	
private DataService dataService ;


public BussinessCalculationService(DataService dataService) {
	super();
	this.dataService = dataService;
}
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
