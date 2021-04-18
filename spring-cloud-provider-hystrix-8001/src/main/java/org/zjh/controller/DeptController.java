package org.zjh.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "hystrixTGet")
    public Dept queryById(@PathVariable("id") Long id) {
        Dept dept = deptService.queryById(id);

        if (dept == null) {
            throw new RuntimeException("id=>" + id + "不存在");
        }

        return dept;
    }

    public Dept hystrixTGet(@PathVariable("id") Long id) {
        return new Dept()
                .setDeptId(id)
                .setDeptName("not found")
                .setDbSource("No this in MySQL");
    }

}
