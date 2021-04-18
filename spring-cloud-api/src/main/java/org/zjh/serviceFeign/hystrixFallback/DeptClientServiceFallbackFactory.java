package org.zjh.serviceFeign.hystrixFallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.zjh.pojo.Dept;
import org.zjh.serviceFeign.DeptClientService;

import java.util.List;

/**
 * @author: zjh
 * @date : 2021/4/18 20:39
 * @Email : 2757412961@qq.com
 * @update:
 */


@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    /** 服务降级 */
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptId(id)
                        .setDeptName("id=>" + id + "，没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭")
                        .setDbSource("没有数据");

            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}
