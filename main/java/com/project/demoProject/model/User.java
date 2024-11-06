package com.project.demoProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	int id;
	String name;
	private Geo geo;
		
		@Data
		@Getter
		@Setter
		@NoArgsConstructor
		@AllArgsConstructor
		public static class Geo{
			String lat;
			String lng;
		}

}
