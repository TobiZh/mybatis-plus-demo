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
@TableName("xunyee.xunyee_navigation")
@ApiModel(value = "XunyeeNavigation对象", description = "")
public class XunyeeNavigation extends Model<XunyeeNavigation> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("icon图标相对路径")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("跳转类型 1 跳转webview，2 app内跳转相关页面")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("跳转参数 type=1 是一个url，type=2 是一个参数")
    @TableField("params")
    private String params;

    @ApiModelProperty("排序升序")
    @TableField("orderby")
    private Integer orderby;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private Date start_time;

    @ApiModelProperty("结束时间")
    @TableField("finish_time")
    private Date finish_time;

    @ApiModelProperty("更新时间")
    @TableField("updated")
    private Date updated;

    @ApiModelProperty("创建时间")
    @TableField("created")
    private Date created;

    @ApiModelProperty("是否在android端开启")
    @TableField("is_enabled_android")
    private Boolean is_enabled_android;

    @ApiModelProperty("是否在小程序开启")
    @TableField("is_enabled_mini")
    private Boolean is_enabled_mini;

    @ApiModelProperty("是否在苹果端开启")
    @TableField("is_enabled_ios")
    private Boolean is_enabled_ios;

    @ApiModelProperty("是否删除")
    @TableField("is_deleted")
    private Boolean is_deleted;

    @TableField("is_enabled")
    private Boolean is_enabled;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
