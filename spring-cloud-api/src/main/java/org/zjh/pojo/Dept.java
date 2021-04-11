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

    private String dbSource;

}
