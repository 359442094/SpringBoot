package sk.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import sk.springboot.entity.Dept;

import java.util.List;

public interface DeptMapper extends BaseMapper<Dept> {
    //查询所有部门
    List<Dept> selectDepts();
}
