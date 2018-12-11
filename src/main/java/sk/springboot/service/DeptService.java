package sk.springboot.service;

import sk.springboot.entity.Dept;

import java.util.List;

public interface DeptService {
    //查询所有部门
    List<Dept> selectDepts();
}
