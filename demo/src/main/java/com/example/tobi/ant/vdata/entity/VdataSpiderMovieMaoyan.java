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
@TableName("vdata.vdata_spider_movie_maoyan")
@ApiModel(value = "VdataSpiderMovieMaoyan对象", description = "")
public class VdataSpiderMovieMaoyan extends Model<VdataSpiderMovieMaoyan> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("movie_maoyan")
    private Integer movie_maoyan;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("boxoffice_raw")
    private Long boxoffice_raw;

    @TableField("boxoffice_corr")
    private Long boxoffice_corr;

    @TableField("boxoffice_incr")
    private Long boxoffice_incr;

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
