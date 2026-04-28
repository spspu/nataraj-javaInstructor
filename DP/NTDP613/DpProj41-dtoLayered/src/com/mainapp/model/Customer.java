package com.mainapp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer implements Serializable{
	private int cid;
	private String cname;
	private String cadd;
	private float billAmt;
	

}
