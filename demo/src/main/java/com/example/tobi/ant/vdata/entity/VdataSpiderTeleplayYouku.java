package com.example.tobi.ant.vdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("vdata.vdata_spider_teleplay_youku")
@ApiModel(value = "VdataSpiderTeleplayYouku对象", description = "")
public class VdataSpiderTeleplayYouku extends Model<VdataSpiderTeleplayYouku> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("teleplay_site")
    private Integer teleplay_site;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("hot_value_raw")
    private Integer hot_value_raw;

    @TableField("hot_value_corr")
    private Integer hot_value_corr;

    @TableField("score_raw")
    private BigDecimal score_raw;

    @TableField("score_corr")
    private BigDecimal score_corr;

    @TableField("fan_count_raw")
    private Long fan_count_raw;

    @TableField("fan_count_corr")
    private Long fan_count_corr;

    @TableField("fan_count_incr")
    private Long fan_count_incr;

    @TableField("like_count_raw")
    private Long like_count_raw;

    @TableField("like_count_corr")
    private Long like_count_corr;

    @TableField("like_count_incr")
    private Long like_count_incr;

    @TableField("comment_count_raw")
    private Long comment_count_raw;

    @TableField("comment_count_corr")
    private Long comment_count_corr;

    @TableField("comment_count_incr")
    private Long comment_count_incr;

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
