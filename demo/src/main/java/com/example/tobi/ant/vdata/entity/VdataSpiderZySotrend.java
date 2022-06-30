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
@TableName("vdata.vdata_spider_zy_sotrend")
@ApiModel(value = "VdataSpiderZySotrend对象", description = "")
public class VdataSpiderZySotrend extends Model<VdataSpiderZySotrend> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("zy_sotrend")
    private Integer zy_sotrend;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("rank_raw")
    private Integer rank_raw;

    @TableField("rank_corr")
    private Integer rank_corr;

    @TableField("hot_value_raw")
    private Integer hot_value_raw;

    @TableField("hot_value_corr")
    private Integer hot_value_corr;

    @TableField("search_index_raw")
    private Integer search_index_raw;

    @TableField("search_index_corr")
    private Integer search_index_corr;

    @TableField("media_index_raw")
    private Integer media_index_raw;

    @TableField("media_index_corr")
    private Integer media_index_corr;

    @TableField("trend")
    private String trend;

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
