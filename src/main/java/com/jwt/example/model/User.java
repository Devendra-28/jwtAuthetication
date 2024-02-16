package com.jwt.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
public class User {
	
	private String userId;
	
	private String name;
	
	private String email;
	

}
