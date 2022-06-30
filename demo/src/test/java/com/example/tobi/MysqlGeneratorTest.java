package com.example.tobi;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MysqlGeneratorTest {


    @Test
    public void meicai(){

        DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
                .Builder("jdbc:mysql://localhost:3306/meicai?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8", "root", "root")
                .dbQuery(new MySqlQuery())
                .keyWordsHandler(new MySqlKeyWordsHandler());


        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                .globalConfig(builder -> {
                    builder.author("tobi") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .disableOpenDir()
                            .dateType(DateType.TIME_PACK)
                            .outputDir("/Users/tobi/IdeaProjects/meicai/meica-api/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.shanghai.tobi") // 设置父包名
                            .moduleName("ant"); // 设置父包模块名
                })
                .strategyConfig(builder -> {
                    builder.mapperBuilder()
                            .enableBaseResultMap()
                            .entityBuilder()
                            .enableFileOverride()
                            .enableActiveRecord()
                            .enableLombok()
                            .enableChainModel()
                            .enableTableFieldAnnotation()
                            .naming(NamingStrategy.underline_to_camel)
                            .idType(IdType.ASSIGN_ID);
                })
                .templateConfig(builder -> {
                    builder.controller(null);
                }).execute();

    }

}
