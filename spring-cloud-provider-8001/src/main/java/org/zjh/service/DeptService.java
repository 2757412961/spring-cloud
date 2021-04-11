package org.zjh.service;

import org.zjh.pojo.Dept;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/11 20:26
 * @Email : 2757412961@qq.com
 * @update:
 */

public interface DeptService {

    boolean addDept(Dept dept);

    List<Dept> queryAll();

    Dept queryById(Long dept_id);

}
