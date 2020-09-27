package com.zhang.Mybatis.controller;

import com.zhang.Mybatis.entity.BusManageAttendanceDetail;
import com.zhang.Mybatis.service.impl.BusManageAttendanceDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/attendance")
public class BusManageAttendanceDetailController {
    
    @Autowired
    BusManageAttendanceDetailServiceImpl manageAttendanceService;
    
    
    
    
}
