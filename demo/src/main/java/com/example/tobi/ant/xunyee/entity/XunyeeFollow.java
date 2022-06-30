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
@TableName("xunyee.xunyee_follow")
@ApiModel(value = "XunyeeFollow对象", description = "")
public class XunyeeFollow extends Model<XunyeeFollow> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("粉丝id")
    @TableField("vcuser_id")
    private Integer vcuser_id;

    @ApiModelProperty("被关注人id")
    @TableField("followed_vcuser_id")
    private Integer followed_vcuser_id;

    @ApiModelProperty("关注状态 0 取消关注 ;1 关注")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("类型 1 已关注; 2 回粉; 3 互相关注")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("更新时间")
    @TableField("updated")
    private Date updated;

    @ApiModelProperty("创建时间")
    @TableField("created")
    private Date created;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
