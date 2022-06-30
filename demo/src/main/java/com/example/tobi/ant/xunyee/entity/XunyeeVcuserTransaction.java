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
@TableName("xunyee.xunyee_vcuser_transaction")
@ApiModel(value = "XunyeeVcuserTransaction对象", description = "")
public class XunyeeVcuserTransaction extends Model<XunyeeVcuserTransaction> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("amount")
    private BigDecimal amount;

    @TableField("balance")
    private BigDecimal balance;

    @TableField("updated")
    private Date updated;

    @TableField("type_id")
    private Integer type_id;

    @TableField("vcuser_id")
    private Integer vcuser_id;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
