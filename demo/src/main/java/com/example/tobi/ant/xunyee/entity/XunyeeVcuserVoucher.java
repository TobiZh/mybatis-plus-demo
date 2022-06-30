package com.example.tobi.ant.xunyee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
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
@TableName("xunyee.xunyee_vcuser_voucher")
@ApiModel(value = "XunyeeVcuserVoucher对象", description = "")
public class XunyeeVcuserVoucher extends Model<XunyeeVcuserVoucher> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("voucher")
    private String voucher;

    @TableField("is_enabled")
    private Boolean is_enabled;

    @TableField("partner")
    private Integer partner;

    @TableField("created")
    private Date created;

    @TableField("updated")
    private Date updated;

    @TableField("benefit_price_id")
    private Long benefit_price_id;

    @TableField("vcuser_id")
    private Integer vcuser_id;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
