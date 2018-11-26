package com.demo.springboot.mapper;

import com.demo.springboot.bean.Employee;

//@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
