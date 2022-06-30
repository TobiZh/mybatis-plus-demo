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
@TableName("xunyee.xunyee_ver")
@ApiModel(value = "XunyeeVer对象", description = "")
public class XunyeeVer extends Model<XunyeeVer> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("oper_sys")
    private Integer oper_sys;

    @TableField("ver_major")
    private Integer ver_major;

    @TableField("ver_minor")
    private Integer ver_minor;

    @TableField("ver_revision")
    private Integer ver_revision;

    @TableField("ver_build")
    private Integer ver_build;

    @TableField("is_lowest")
    private Boolean is_lowest;

    @TableField("url")
    private String url;

    @TableField("description")
    private String description;

    @TableField("orderby")
    private Integer orderby;

    @TableField("is_enabled")
    private Boolean is_enabled;

    @TableField("updated")
    private Date updated;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
