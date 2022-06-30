package com.example.tobi.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.tobi.ant.*.mapper")
public class MybatisPlusConfig {

//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor() {
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        // 分页插件
//        PaginationInnerInterceptor paginationInnerInterceptor=new PaginationInnerInterceptor(DbType.POSTGRE_SQL);
//        paginationInnerInterceptor.setMaxLimit(100L);//最大100条
//        interceptor.addInnerInterceptor(paginationInnerInterceptor);
//        // 防全表更新删除
//        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
//        return interceptor;
//    }
}
