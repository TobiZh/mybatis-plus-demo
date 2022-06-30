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
@TableName("vdata.vdata_spider_teleplay_baidutop")
@ApiModel(value = "VdataSpiderTeleplayBaidutop对象", description = "")
public class VdataSpiderTeleplayBaidutop extends Model<VdataSpiderTeleplayBaidutop> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("teleplay_baidutop")
    private Integer teleplay_baidutop;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("search_index_raw")
    private Integer search_index_raw;

    @TableField("search_index_corr")
    private Integer search_index_corr;

    @TableField("search_index_rank")
    private Integer search_index_rank;

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
