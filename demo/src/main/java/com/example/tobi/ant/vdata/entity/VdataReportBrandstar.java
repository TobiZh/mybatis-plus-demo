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
@TableName("vdata.vdata_report_brandstar")
@ApiModel(value = "VdataReportBrandstar对象", description = "")
public class VdataReportBrandstar extends Model<VdataReportBrandstar> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("brand_person_id")
    private Long brand_person_id;

    @TableField("begin_date")
    private LocalDate begin_date;

    @TableField("end_date")
    private LocalDate end_date;

    @TableField("huati_read_count_incr")
    private Long huati_read_count_incr;

    @TableField("huati_post_count_incr")
    private Long huati_post_count_incr;

    @TableField("huati_fan_count_incr")
    private Long huati_fan_count_incr;

    @TableField("jd_cos_price")
    private BigDecimal jd_cos_price;

    @TableField("jd_cos_fee")
    private BigDecimal jd_cos_fee;

    @TableField("actor_index")
    private BigDecimal actor_index;

    @TableField("total_score")
    private BigDecimal total_score;

    @TableField("created")
    private Date created;

    @TableField("updated")
    private Date updated;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
