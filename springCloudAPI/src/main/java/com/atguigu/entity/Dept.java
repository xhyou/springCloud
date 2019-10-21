package com.atguigu.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by xuehy
 *
 * @version 1.0.0
 */
@Setter
@Getter
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable {

    private Long deptNo;
    private String deptName;
    private String dbSource;
}
