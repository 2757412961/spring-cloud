package org.zjh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zjh.pojo.Dept;
import org.zjh.serviceFeign.DeptClientService;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/17 16:42
 * @Email : 2757412961@qq.com
 * @update:
 */

@RestController
@RequestMapping("/feign")
public class FeignController {

    /**
     * feign
     */
    @Autowired
    private DeptClientService deptClientService = null;

    @GetMapping("/dept/get/all")
    public List<?> getAll() {
        return deptClientService.queryAll();
    }

    @GetMapping("/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        return deptClientService.queryById(id);
    }

    @PostMapping("/dept/add")
    public Boolean addDept(@RequestBody Dept dept){
        return deptClientService.addDept(dept);
    }

}
