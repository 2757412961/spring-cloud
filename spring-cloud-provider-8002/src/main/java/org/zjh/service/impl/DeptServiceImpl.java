package org.zjh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zjh.dao.DeptMapper;
import org.zjh.pojo.Dept;
import org.zjh.service.DeptService;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/11 20:27
 * @Email : 2757412961@qq.com
 * @update:
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }

    @Override
    public Dept queryById(Long deptId) {
        return deptMapper.queryById(deptId);
    }

}
