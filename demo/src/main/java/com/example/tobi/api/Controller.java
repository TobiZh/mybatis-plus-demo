package com.example.tobi.api;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.tobi.ant.xunyee.entity.XunyeeAd;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @RequestMapping("ad")
    public List<XunyeeAd> xunyeeAd(){
        LambdaQueryWrapper<XunyeeAd> qw=new LambdaQueryWrapper<>();
        qw.last("limit 10");
        List<XunyeeAd> xunyeeAd=new XunyeeAd().selectList(qw);
        return xunyeeAd;
    }
}
