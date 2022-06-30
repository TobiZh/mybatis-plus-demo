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
@TableName("vdata.vdata_spider_brand_person_jd")
@ApiModel(value = "VdataSpiderBrandPersonJd对象", description = "")
public class VdataSpiderBrandPersonJd extends Model<VdataSpiderBrandPersonJd> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("promotion_id")
    private Long promotion_id;

    @TableField("promotion_name")
    private String promotion_name;

    @TableField("source_emt_str")
    private String source_emt_str;

    @TableField("order_num")
    private Integer order_num;

    @TableField("cos_price")
    private BigDecimal cos_price;

    @TableField("cos_fee")
    private BigDecimal cos_fee;

    @TableField("finish_order_num")
    private Integer finish_order_num;

    @TableField("finish_cos_price")
    private BigDecimal finish_cos_price;

    @TableField("finish_cos_fee")
    private BigDecimal finish_cos_fee;

    @TableField("click_num")
    private Integer click_num;

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
