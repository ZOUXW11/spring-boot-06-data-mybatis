package com.demo.springboot.mapper;

import com.demo.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

//指定这是一个数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deletDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")//返回自增id
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
