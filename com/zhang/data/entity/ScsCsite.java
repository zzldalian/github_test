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
 * (scs_csite)实体类
 *
 * @author kancy
 * @since 2020-09-14 13:55:45
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("scs_csite")
public class ScsCsite extends Model<ScsCsite> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
	private Long id;
    /**
     * idnumber
     */
    private String idnumber;
    /**
     * datanumber
     */
    private String datanumber;
    /**
     * name
     */
    private String name;
    /**
     * bagsbh
     */
    private String bagsbh;
    /**
     * similarity
     */
    private Integer similarity;
    /**
     * minsimilarity
     */
    private Integer minsimilarity;
    /**
     * faceangle
     */
    private Integer faceangle;
    /**
     * threshold
     */
    private Integer threshold;
    /**
     * province
     */
    private String province;
    /**
     * city
     */
    private String city;
    /**
     * sim
     */
    private Integer sim;
    /**
     * district
     */
    private String district;
    /**
     * status
     */
    private Integer status;
    /**
     * versionnumber
     */
    private String versionnumber;
    /**
     * rangetype
     */
    private Integer rangetype;
    /**
     * requestcount
     */
    private Integer requestcount;
    /**
     * qrcode
     */
    private String qrcode;
    /**
     * attendanceway
     */
    private Integer attendanceway;
    /**
     * authkey
     */
    private String authkey;
    /**
     * password
     */
    private String password;
    /**
     * contractno
     */
    private String contractno;
    /**
     * projectname
     */
    private String projectname;
    /**
     * address
     */
    private String address;
    /**
     * area
     */
    private BigDecimal area;
    /**
     * projectcost
     */
    private BigDecimal projectcost;
    /**
     * unitname
     */
    private String unitname;
    /**
     * creditcode
     */
    private String creditcode;
    /**
     * projectcontacts
     */
    private String projectcontacts;
    /**
     * projecttel
     */
    private String projecttel;
    /**
     * enpname
     */
    private String enpname;
    /**
     * buildtype
     */
    private String buildtype;
    /**
     * enpcontacts
     */
    private String enpcontacts;
    /**
     * enptel
     */
    private String enptel;
    /**
     * creator
     */
    private String creator;
    /**
     * createtime
     */
    private Date createtime;
    /**
     * teamview
     */
    private String teamview;
    /**
     * monitortype
     */
    private String monitortype;
    /**
     * onlinetime
     */
    private Date onlinetime;
    /**
     * ismaster
     */
    private Integer ismaster;
    /**
     * createTime
     */
    private Date createTime;
    /**
     * appid
     */
    private String appid;

}