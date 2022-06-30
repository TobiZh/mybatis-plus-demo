package com.example.tobi.ant.xunyee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author tobi
 * @since 2021-11-09
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("xunyee.xunyee_vcuser_oauth")
@ApiModel(value = "XunyeeVcuserOauth对象", description = "")
public class XunyeeVcuserOauth extends Model<XunyeeVcuserOauth> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("site")
    private Integer site;

    @TableField("openid")
    private String openid;

    @TableField("session_key")
    private String session_key;

    @TableField("unionid")
    private String unionid;

    @TableField("is_enabled")
    private Boolean is_enabled;

    @TableField("updated")
    private Date updated;

    @TableField("vcuser_id")
    private Integer vcuser_id;

    @TableField("access_token")
    private String access_token;

    @TableField("access_token_expires_in")
    private Date access_token_expires_in;

    @TableField("refresh_token")
    private String refresh_token;

    @TableField("refresh_token_expires_in")
    private Date refresh_token_expires_in;

    @TableField("created")
    private Date created;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
