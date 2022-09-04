package com.zuoye0902.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("Department")
public class Department {
    @TableId("deptid")
    private Integer deptid;
    private String dname;
    private String loc;
}
