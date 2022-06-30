package com.example.tobi.ant.vdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.time.LocalDate;
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
@TableName("vdata.vdata_report")
@ApiModel(value = "VdataReport对象", description = "")
public class VdataReport extends Model<VdataReport> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("memo")
    private String memo;

    @TableField("start_time")
    private LocalDate start_time;

    @TableField("finish_time")
    private LocalDate finish_time;

    @TableField("orderby")
    private Integer orderby;

    @TableField("is_enabled")
    private Boolean is_enabled;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
