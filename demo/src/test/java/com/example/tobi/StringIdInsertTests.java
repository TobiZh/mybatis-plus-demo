package com.example.tobi;

import com.example.tobi.ant.xunyee.entity.XunyeeVcuserOauth;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;

@SpringBootTest
public class StringIdInsertTests {


    @Test
    void insertVcuserAuth(){
        XunyeeVcuserOauth userThird = new XunyeeVcuserOauth();
        userThird.setId(UUID.randomUUID().toString());//@TableId(value = "id", type = IdType.INPUT)
        userThird.setVcuser_id(19);
        userThird.setIs_enabled(true);
        userThird.setUpdated(new Date());
        userThird.setSite(5);
        userThird.setOpenid("openid");
        userThird.setUnionid("unionid");
        userThird.insert();
    }
}
