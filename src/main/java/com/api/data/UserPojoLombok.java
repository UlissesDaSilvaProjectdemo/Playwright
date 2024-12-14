package com.api.data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder


public class UserPojoLombok {
	
	public static String id;
	public static String fname;
	public static String lname;
	public static String email;
    public static String age;
	public static String gender;
	public static String status;
	

	
}
