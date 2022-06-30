package com.example.tobi.ant.vdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.time.LocalDate;
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
@TableName("vdata.vdata_spider_teleplay_weibo")
@ApiModel(value = "VdataSpiderTeleplayWeibo对象", description = "")
public class VdataSpiderTeleplayWeibo extends Model<VdataSpiderTeleplayWeibo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("teleplay")
    private Integer teleplay;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("follow_count_raw")
    private Long follow_count_raw;

    @TableField("follow_count_corr")
    private Long follow_count_corr;

    @TableField("follow_count_incr")
    private Long follow_count_incr;

    @TableField("fan_count_raw")
    private Long fan_count_raw;

    @TableField("fan_count_corr")
    private Long fan_count_corr;

    @TableField("fan_count_incr")
    private Long fan_count_incr;

    @TableField("post_count_raw")
    private Long post_count_raw;

    @TableField("post_count_corr")
    private Long post_count_corr;

    @TableField("post_count_incr")
    private Long post_count_incr;

    @TableField("spider")
    private Integer spider;

    @TableField("oper_user")
    private Integer oper_user;

    @TableField("updated")
    private Date updated;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
