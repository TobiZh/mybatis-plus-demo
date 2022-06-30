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
@TableName("vdata.vdata_report_brand_person")
@ApiModel(value = "VdataReportBrandPerson对象", description = "")
public class VdataReportBrandPerson extends Model<VdataReportBrandPerson> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("brand_person")
    private Long brand_person;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("huati_read_count_incr_sum")
    private Long huati_read_count_incr_sum;

    @TableField("huati_post_count_incr_sum")
    private Long huati_post_count_incr_sum;

    @TableField("huati_fan_count_incr_sum")
    private Long huati_fan_count_incr_sum;

    @TableField("jd_cos_price_sum")
    private BigDecimal jd_cos_price_sum;

    @TableField("jd_cos_fee_sum")
    private BigDecimal jd_cos_fee_sum;

    @TableField("report_2003_sum")
    private BigDecimal report_2003_sum;

    @TableField("oper_user")
    private Integer oper_user;

    @TableField("updated")
    private Date updated;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
