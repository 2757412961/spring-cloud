package org.zjh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zjh.pojo.Dept;
import org.zjh.serviceFeign.DeptService;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/11 20:30
 * @Email : 2757412961@qq.com
 * @update:
 */

@RequestMapping("/dept")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/get/all")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    @GetMapping("/get/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }

}
