package com.mainapp.event;

import lombok.Data;

@Data
public class EmployeeEvent {
    private String id;
    private String name;
    private String address;
    private double salary;
}