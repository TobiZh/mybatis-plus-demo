package com.example.tobi.ant.xunyee.entity;

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
@TableName("xunyee.xunyee_vcuser_benefit_refund")
@ApiModel(value = "XunyeeVcuserBenefitRefund对象", description = "")
public class XunyeeVcuserBenefitRefund extends Model<XunyeeVcuserBenefitRefund> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户id")
    @TableField("vcuser_id")
    private Integer vcuser_id;

    @ApiModelProperty("微信订单号")
    @TableField("transaction_id")
    private String transaction_id;

    @ApiModelProperty("商户订单号")
    @TableField("out_trade_no")
    private String out_trade_no;

    @ApiModelProperty("开始时间")
    @TableField("start_date")
    private LocalDate start_date;

    @ApiModelProperty("创建时间")
    @TableField("created")
    private Date created;

    @ApiModelProperty("状态码 0 默认状态未操作 1 退款成功 -1 退款失败")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("支付金额")
    @TableField("price")
    private BigDecimal price;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
