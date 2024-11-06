package com.project.demoProject.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.demoProject.model.User;

@Service
public class UserService {
	private final RestTemplate restTemplate;
		
		public UserService(RestTemplate restTemplate) {
			this.restTemplate=restTemplate;
		}
		
		public List<User> getUser(){
			String url  = "https://jsonplaceholder.typicode.com/users";
			User[] users = restTemplate.getForObject(url, User[].class);
			
			return Arrays.stream(users)
						.map(user ->{
							User.Geo geo = new User.Geo();
							geo.setLat(user.getGeo().getLat());
							geo.setLng(user.getGeo().getLng());
							
							User filteredUser = new User();
		                    filteredUser.setId(user.getId());
		                    filteredUser.setName(user.getName());
		                    filteredUser.setGeo(geo);
		                    
		                    return filteredUser;
						})
						.collect(Collectors.toList());
		}
	

}
