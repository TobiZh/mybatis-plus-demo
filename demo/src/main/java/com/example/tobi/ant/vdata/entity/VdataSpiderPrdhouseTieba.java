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
@TableName("vdata.vdata_spider_prdhouse_tieba")
@ApiModel(value = "VdataSpiderPrdhouseTieba对象", description = "")
public class VdataSpiderPrdhouseTieba extends Model<VdataSpiderPrdhouseTieba> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("prdhouse")
    private Integer prdhouse;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("topic_count_raw")
    private Long topic_count_raw;

    @TableField("topic_count_corr")
    private Long topic_count_corr;

    @TableField("topic_count_incr")
    private Long topic_count_incr;

    @TableField("post_count_raw")
    private Long post_count_raw;

    @TableField("post_count_corr")
    private Long post_count_corr;

    @TableField("post_count_incr")
    private Long post_count_incr;

    @TableField("member_count_raw")
    private Long member_count_raw;

    @TableField("member_count_corr")
    private Long member_count_corr;

    @TableField("member_count_incr")
    private Long member_count_incr;

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
