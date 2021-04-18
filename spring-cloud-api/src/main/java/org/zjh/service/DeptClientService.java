package org.zjh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zjh.pojo.Dept;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/18 17:53
 * @Email : 2757412961@qq.com
 * @update:
 */

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIER-DEPT")
public interface DeptClientService {

    @GetMapping("/dept/get/all")
    public List<Dept> queryAll();

    @GetMapping("/dept/get/{id}")
    public Dept querById(@PathVariable("id") Long id);

    @PostMapping("/dept/add")
    public Boolean addDept(Dept dept);

}
