package sk.springboot.mapper;

import sk.springboot.entity.Dept;

import java.util.List;

public interface DeptMapper {
    //查询所有部门
    List<Dept> selectDepts();
}
