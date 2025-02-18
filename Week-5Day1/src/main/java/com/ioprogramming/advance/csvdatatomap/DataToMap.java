package com.ioprogramming.advance.csvdatatomap;

import com.opencsv.bean.CsvToBean;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataToMap {
    private String ID;
    private String Name;
    private String Department;
    private String Salary;
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }
    public String getSalary() {
        return Salary;
    }
    public void setSalary(String salary) {
        Salary = salary;

    }
    @Override
    public String toString(){
        return ID + " | " + Name + " | " + Department + " | " + Salary;
    }
}
