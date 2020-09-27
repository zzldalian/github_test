package com.zhang.Mybatis.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhang.Mybatis.entity.BusManageAttendanceDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface BusManageAttendanceDetailMapper extends BaseMapper<BusManageAttendanceDetail> {
    
    public List<BusManageAttendanceDetail> selectAll(@Param(Constants.WRAPPER) Wrapper<BusManageAttendanceDetail> wrapper);
    
    public IPage<Map<String,Object>> selectBusManageDetailPage(Page<Map<String,Object>> page, @Param(Constants.WRAPPER) Wrapper<BusManageAttendanceDetail> wrapper);

    
}