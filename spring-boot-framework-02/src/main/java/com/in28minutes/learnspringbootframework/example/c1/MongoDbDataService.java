package com.in28minutes.learnspringbootframework.example.c1;
import org.springframework.stereotype.Component;


@Component
@Primary
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
	
		return new int[] {1,2,4,5,7,8,9};
	
	}
}
