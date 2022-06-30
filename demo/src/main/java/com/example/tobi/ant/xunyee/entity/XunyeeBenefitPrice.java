package com.example.tobi.ant.xunyee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("xunyee.xunyee_benefit_price")
@ApiModel(value = "XunyeeBenefitPrice对象", description = "")
public class XunyeeBenefitPrice extends Model<XunyeeBenefitPrice> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("start_time")
    private Date start_time;

    @TableField("finish_time")
    private Date finish_time;

    @TableField("is_enabled")
    private Boolean is_enabled;

    @TableField("price")
    private BigDecimal price;

    @TableField("quantity")
    private Integer quantity;

    @TableField("benefit_id")
    private Integer benefit_id;

    @TableField("tag_price")
    private BigDecimal tag_price;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
