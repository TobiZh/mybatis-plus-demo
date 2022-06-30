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
@TableName("xunyee.xunyee_pic")
@ApiModel(value = "XunyeePic对象", description = "")
public class XunyeePic extends Model<XunyeePic> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("title")
    private String title;

    @TableField("memo")
    private String memo;

    @TableField("pic")
    private String pic;

    @TableField("sequence")
    private Integer sequence;

    @TableField("url")
    private String url;

    @TableField("start_time")
    private Date start_time;

    @TableField("finish_time")
    private Date finish_time;

    @TableField("type_id")
    private Integer type_id;

    @TableField("is_enabled_5")
    private Boolean is_enabled_5;

    @TableField("is_enabled_6")
    private Boolean is_enabled_6;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
