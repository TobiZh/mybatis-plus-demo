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
@TableName("xunyee.xunyee_vcuser_benefit_payorder")
@ApiModel(value = "XunyeeVcuserBenefitPayorder对象", description = "")
public class XunyeeVcuserBenefitPayorder extends Model<XunyeeVcuserBenefitPayorder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("price")
    private BigDecimal price;

    @TableField("quantity")
    private Integer quantity;

    @TableField("is_paid")
    private Boolean is_paid;

    @TableField("site")
    private Integer site;

    @TableField("site_transaction_id")
    private String site_transaction_id;

    @TableField("created")
    private Date created;

    @TableField("updated")
    private Date updated;

    @TableField("benefit_price_id")
    private Long benefit_price_id;

    @TableField("rel_order_id")
    private Long rel_order_id;

    @TableField("vcuser_id")
    private Integer vcuser_id;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
