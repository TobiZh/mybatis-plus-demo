package com.example.tobi.ant.vdata.entity;

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
@TableName("vdata.vdata_spider_teleplay_douban_comments")
@ApiModel(value = "VdataSpiderTeleplayDoubanComments对象", description = "")
public class VdataSpiderTeleplayDoubanComments extends Model<VdataSpiderTeleplayDoubanComments> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("teleplay")
    private Integer teleplay;

    @TableField("cid")
    private Long cid;

    @TableField("author_raw")
    private String author_raw;

    @TableField("author_corr")
    private String author_corr;

    @TableField("rating_raw")
    private Long rating_raw;

    @TableField("rating_corr")
    private Long rating_corr;

    @TableField("comment_time_raw")
    private Date comment_time_raw;

    @TableField("comment_time_corr")
    private Date comment_time_corr;

    @TableField("vote_count_raw")
    private Long vote_count_raw;

    @TableField("vote_count_corr")
    private Long vote_count_corr;

    @TableField("short_raw")
    private String short_raw;

    @TableField("short_corr")
    private String short_corr;

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
