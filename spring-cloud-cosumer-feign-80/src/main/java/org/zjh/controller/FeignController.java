package org.zjh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zjh.service.DeptClientService;

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

    @RequestMapping("/dept/get/all")
    public List<?> getAll() {
        return deptClientService.queryAll();
    }

}
