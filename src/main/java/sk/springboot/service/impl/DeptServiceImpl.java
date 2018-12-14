package sk.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.springboot.entity.Dept;
import sk.springboot.mapper.DeptMapper;
import sk.springboot.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> selectDepts() {
        return deptMapper.selectDepts();
    }

    /**
     * 添加
     * */
    @Override
    public boolean insert(Dept entity) {
        return super.insert(entity);
    }
}
