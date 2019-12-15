package com.mani.northwestapp;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WorldUniversitiesServiceImpl  implements WorldUniversitiesService{
	private org.slf4j.Logger logger = LoggerFactory.getLogger(WorldUniversitiesController.class);
	public String worldUniversityConsumedList() {
		try {
		RestTemplate restTemplate= new RestTemplate();
		String universityList= restTemplate.getForObject("http://universities.hipolabs.com/search", String.class);
		
		return universityList;
		}
		catch(HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
		        return "Sorry for the Inconvineince. The API Server is Down.";
		    }
		    throw e;
		}
	}

}
