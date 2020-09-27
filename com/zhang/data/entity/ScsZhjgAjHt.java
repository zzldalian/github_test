package com.zhang.data.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (scs_zhjg_aj_ht)实体类
 *
 * @author kancy
 * @since 2020-09-14 13:55:24
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("scs_zhjg_aj_ht")
public class ScsZhjgAjHt extends Model<ScsZhjgAjHt> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
	private Integer id;
    /**
     * uuid
     */
    private String uuid;
    /**
     * 合同备案编码
     */
    private String recordnum;
    /**
     * 合同类别
100	勘察
200	设计
301	施工总包
302	施工分包
303	施工劳务
400	监理
500	设计施工一体化
600	工程总承包
700	项目管理
304	专业承包
     */
    private String contracttypenum;
    /**
     * 合同金额（万元)
     */
    private String contractmoney;
    /**
     * 承包单位组织机构代码
     */
    private String corpcode;
    /**
     * 承包单位名称
     */
    private String corpname;
    /**
     * 合同建设规模
     */
    private String prjsize;
    /**
     * 项目负责人
     */
    private String xmfzr;
    /**
     * 项目负责人身份证号
     */
    private String xmfzrsfzh;

}