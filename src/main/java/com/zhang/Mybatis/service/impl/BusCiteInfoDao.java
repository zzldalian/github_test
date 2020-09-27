package com.zhang.Mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhang.Mybatis.entity.BusCiteInfo;
import com.zhang.Mybatis.mapper.BusCiteInfoMapper;
import com.zhang.Mybatis.service.BusCsiteInfoService;
import lombok.extern.slf4j.Slf4j;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * (bus_cite_info)数据DAO
 *
 * @author kancy
 * @since 2020-09-14 12:09:42
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@Repository
public class BusCiteInfoDao extends ServiceImpl<BusCiteInfoMapper, BusCiteInfo> implements BusCsiteInfoService {
    
}