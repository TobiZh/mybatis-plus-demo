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
@TableName("xunyee.xunyee_vcuser")
@ApiModel(value = "XunyeeVcuser对象", description = "")
public class XunyeeVcuser extends Model<XunyeeVcuser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("nickname")
    private String nickname;

    @TableField("sex")
    private Integer sex;

    @TableField("avatar")
    private String avatar;

    @TableField("email")
    private String email;

    @TableField("phone")
    private Long phone;

    @TableField("is_enabled")
    private Boolean is_enabled;

    @TableField("updated")
    private Date updated;

    @TableField("wx_city")
    private String wx_city;

    @TableField("wx_country")
    private String wx_country;

    @TableField("wx_province")
    private String wx_province;

    @TableField("created")
    private Date created;

    @ApiModelProperty("微信的头像")
    @TableField("wx_avatar")
    private String wx_avatar;

    @ApiModelProperty("微信的昵称")
    @TableField("wx_nickanme")
    private String wx_nickanme;

    @ApiModelProperty("0 正常 1 限制发动态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("用户封面图")
    @TableField("cover")
    private String cover;

    @ApiModelProperty("个人简介")
    @TableField("bio")
    private String bio;

    @ApiModelProperty("锁定原因")
    @TableField("lock_reason")
    private String lock_reason;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
