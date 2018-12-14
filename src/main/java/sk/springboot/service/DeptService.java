package sk.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import sk.springboot.entity.Dept;

import java.util.List;

public interface DeptService extends IService<Dept> {
    //查询所有部门
    List<Dept> selectDepts();
}
