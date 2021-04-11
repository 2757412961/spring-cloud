package org.zjh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: zjh
 * @date : 2021/4/9 21:58
 * @Email : 2757412961@qq.com
 * @update:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptId;

    private String deptName;

    /**
     * 这个数据数存在哪个数据库的字段~微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
     */
    private String dbSource;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
