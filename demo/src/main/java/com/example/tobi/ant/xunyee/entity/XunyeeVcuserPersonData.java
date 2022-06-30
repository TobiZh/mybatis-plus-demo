package com.example.tobi.ant.xunyee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据中心 用户订阅艺人表
 * </p>
 *
 * @author tobi
 * @since 2021-11-09
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("xunyee.xunyee_vcuser_person_data")
@ApiModel(value = "XunyeeVcuserPersonData对象", description = "数据中心 用户订阅艺人表")
public class XunyeeVcuserPersonData extends Model<XunyeeVcuserPersonData> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("艺人id")
    @TableField("person")
    private Integer person;

    @ApiModelProperty("用户id")
    @TableField("vcuser_id")
    private Integer vcuser_id;

    @ApiModelProperty("更新时间，一个月内只能更换一次")
    @TableField("change_date")
    private LocalDate change_date;

    @TableField("created")
    private Date created;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
