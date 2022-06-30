package com.example.tobi.ant.vdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("vdata.vdata_coef")
@ApiModel(value = "VdataCoef对象", description = "")
public class VdataCoef extends Model<VdataCoef> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("bin")
    private Long bin;

    @TableField("coef")
    private BigDecimal coef;

    @TableField("category_id")
    private Integer category_id;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
