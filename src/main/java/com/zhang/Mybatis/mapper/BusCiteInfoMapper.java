package com.zhang.Mybatis.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhang.Mybatis.Vo.TestVo;
import com.zhang.Mybatis.entity.BusCiteInfo;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * (bus_cite_info)数据Mapper
 *
 * @author kancy
 * @since 2020-09-14 12:09:42
 * @description 由 Mybatisplus Code Generator 创建
*/
@Mapper
public interface BusCiteInfoMapper extends BaseMapper<BusCiteInfo> {
   
   @Select("") 
   List<TestVo> getNames(Pagination page);
}
