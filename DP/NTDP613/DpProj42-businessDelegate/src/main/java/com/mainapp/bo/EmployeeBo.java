package com.mainapp.bo;

import lombok.Data;

@Data
public abstract class EmployeeBo {
    private int eno;
    private String ename;
    private String addrs;
}