package com.example.tobi;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.example.tobi.ant.vdata.entity.VdataCoefcategory;
import com.example.tobi.ant.xunyee.entity.XunyeeAd;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@Slf4j
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        ObjectMapper objectMapper=new ObjectMapper();

        LambdaQueryWrapper<XunyeeAd> qw=new LambdaQueryWrapper<>();
        qw.last("limit 10");
        List<XunyeeAd> xunyeeAd=new XunyeeAd().selectList(qw);

        log.info("数量：{}",xunyeeAd.size());
        try {
            log.info("数量：{}",objectMapper.writeValueAsString(xunyeeAd));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        LambdaQueryWrapper<VdataCoefcategory> vqw=new LambdaQueryWrapper<>();

        List<VdataCoefcategory> coefcategories=new VdataCoefcategory().selectAll();




        log.info("数量：{}",coefcategories.size());
        try {
            log.info("数据：{}",objectMapper.writeValueAsString(coefcategories));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }




}
