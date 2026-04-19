package com.mainapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoEntity {
	
	private Integer uid;
	private String uname;
	private String addrs;
	private String email;

}
