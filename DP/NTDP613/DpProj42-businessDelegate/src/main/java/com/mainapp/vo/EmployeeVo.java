package com.mainapp.vo;

import lombok.Data;

@Data // gives  setters + getters + equals(-), hashCode(),toString()
public class EmployeeVo {
   private String  ename;
   private String  addrs;
   private  String desg;
   private  String salary;
}