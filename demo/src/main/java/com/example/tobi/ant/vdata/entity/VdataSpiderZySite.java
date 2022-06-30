package com.example.tobi.ant.vdata.entity;

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
 * 
 * </p>
 *
 * @author tobi
 * @since 2021-11-09
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("vdata.vdata_spider_zy_site")
@ApiModel(value = "VdataSpiderZySite对象", description = "")
public class VdataSpiderZySite extends Model<VdataSpiderZySite> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("zy_site")
    private Integer zy_site;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("play_count_raw")
    private Long play_count_raw;

    @TableField("play_count_corr")
    private Long play_count_corr;

    @TableField("play_count_incr")
    private Long play_count_incr;

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
