package org.zjh.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.zjh.pojo.Dept;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/11 20:16
 * @Email : 2757412961@qq.com
 * @update:
 */

@Mapper
@Repository
public interface DeptMapper {

    boolean addDept(Dept dept);

    List<Dept> queryAll();

    Dept queryById(@Param(value = "deptId") Long deptId);

}