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
@TableName("vdata.vdata_spider_teleplay_douban")
@ApiModel(value = "VdataSpiderTeleplayDouban对象", description = "")
public class VdataSpiderTeleplayDouban extends Model<VdataSpiderTeleplayDouban> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("teleplay")
    private Integer teleplay;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("rating_raw")
    private BigDecimal rating_raw;

    @TableField("rating_corr")
    private BigDecimal rating_corr;

    @TableField("rating_count_raw")
    private Long rating_count_raw;

    @TableField("rating_count_corr")
    private Long rating_count_corr;

    @TableField("rating_count_incr")
    private Long rating_count_incr;

    @TableField("comment_count_raw")
    private Long comment_count_raw;

    @TableField("comment_count_corr")
    private Long comment_count_corr;

    @TableField("comment_count_incr")
    private Long comment_count_incr;

    @TableField("review_count_raw")
    private Long review_count_raw;

    @TableField("review_count_corr")
    private Long review_count_corr;

    @TableField("review_count_incr")
    private Long review_count_incr;

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
