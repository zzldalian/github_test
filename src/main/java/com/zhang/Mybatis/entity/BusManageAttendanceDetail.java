package com.zhang.Mybatis.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * bus_manage_attendance_detail
 * @author 张
 */
@Data
@TableName("bus_manage_attendance_detail")
@EqualsAndHashCode(callSuper = false)//开启AR模式，需继承苞米豆为我们提供的Model抽象类，消除警告不调用父类构造方法
public class BusManageAttendanceDetail extends Model<BusManageAttendanceDetail> implements Serializable {
    
    /**
     * 唯一标识
     */
    @TableId(value = "id",type = IdType.INPUT)
    private Integer id;

    /**
     * 创建时间
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private Date createtime;

    /**
     * 最后修改时间
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private Date updatetime;

    /**
     * 姓名
     */
    
    @TableField(condition = SqlCondition.LIKE,whereStrategy = FieldStrategy.NOT_EMPTY)
    private String name;

    /**
     * 管理人员编号
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String manageId;

    /**
     * 身份证
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String certnum;

    /**
     * 出勤日期
     */
    @TableField(condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private String attendanceDate;

    /**
     * uuid
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String uuid;

    /**
     * 合同备案号
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String contractRecord;

    /**
     * 企业组织机构代码
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String corpCode;

    private static final long serialVersionUID = 1L;
}