package com.zhang.Mybatis.configuration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@Configuration
@MapperScan("com.zhang.Mybatis.mapper")
public class MybatisPlusConfig {
    
    @Bean
    public PaginationInterceptor paginationInnerInterceptor(){
        PaginationInterceptor paginationInnerInterceptor = new PaginationInterceptor();
        return paginationInnerInterceptor;
    }
}
