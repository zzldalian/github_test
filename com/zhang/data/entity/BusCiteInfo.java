package com.zhang.data.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (bus_cite_info)实体类
 *
 * @author kancy
 * @since 2020-09-14 12:09:42
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("bus_cite_info")
public class BusCiteInfo extends Model<BusCiteInfo> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
    @TableId
	private Integer id;
    /**
     * 外键、字典：101、工地状态（项目状态）
     */
    private String citeStatus;
    /**
     * 工地名称（工程名称）
     */
    private String citeName;
    /**
     * 工地id(外部导入)
     */
    private String citeId;
    /**
     * 工地地址（工程地址）
     */
    private String citeAddress;
    /**
     * 工地类型
、外键、字典：102
     */
    private String citeType;
    /**
     * 合同备案号
     */
    private String contractRecord;
    /**
     * 备案日期
     */
    private Date contractDate;
    /**
     * 施工许可证
     */
    private String constructionPermit;
    /**
     * 合同价格
/单位：万元
     */
    private BigDecimal contractAmount;
    /**
     * 建筑面积
     */
    private BigDecimal constructionArea;
    /**
     * 项目所在地（所属区域）
     */
    private String location;
    /**
     * 建设单位
     */
    private String constructionUnit;
    /**
     * constructionCode
     */
    private String constructionCode;
    /**
     * 建设单位id
     */
    private Integer constructionId;
    /**
     * 施工单位
     */
    private String implementUnit;
    /**
     * implementCode
     */
    private String implementCode;
    /**
     * 施工单位id
     */
    private Integer implementId;
    /**
     * 监理单位
     */
    private String superviseUnit;
    /**
     * superviseCode
     */
    private String superviseCode;
    /**
     * 监理单位id
     */
    private Integer superviseId;
    /**
     * 工人工资专属账号
     */
    private String workerSalaryAccount;
    /**
     * 实名制-安装情况
     */
    private String idStatus;
    /**
     * 实名制-安装完成日期
     */
    private Date idInstallationDate;
    /**
     * 实名制-交底日期
     */
    private Date confessDate;
    /**
     * 扬尘-安装情况
     */
    private String dustStatus;
    /**
     * 扬尘-安装完成日期
     */
    private Date dustInstallationDate;
    /**
     * 扬尘-交底日期
     */
    private Date dustConfessDate;
    /**
     * 危大-安装情况
     */
    private String dangerStatus;
    /**
     * 危大-安装完成日期
     */
    private Date dangerInstallationDate;
    /**
     * 危大-交底日期
     */
    private Date dangerConfessDate;
    /**
     * 预留1-安装情况
     */
    private String ex1Status;
    /**
     * 预留1-安装完成日期
     */
    private Date ex1InstallationDate;
    /**
     * 预留1-交底日期
     */
    private Date ex1ConfessDate;
    /**
     * 预留2-安装情况
     */
    private String ex2Status;
    /**
     * 预留2-安装完成日期
     */
    private Date ex2InstallationDate;
    /**
     * 预留2-交底日期
     */
    private Date ex2ConfessDate;
    /**
     * createtime
     */
    private Date createtime;
    /**
     * updatetime
     */
    private Date updatetime;
    /**
     * dyId
     */
    private String dyId;

}