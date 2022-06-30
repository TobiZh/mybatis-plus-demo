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
 * 动态浏览记录
 * </p>
 *
 * @author tobi
 * @since 2021-11-09
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("xunyee.xunyee_blog_browsing_history")
@ApiModel(value = "XunyeeBlogBrowsingHistory对象", description = "动态浏览记录")
public class XunyeeBlogBrowsingHistory extends Model<XunyeeBlogBrowsingHistory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("blog_id")
    private Integer blog_id;

    @TableField("vcuser_id")
    private Integer vcuser_id;

    @TableField("last_brow_time")
    private Date last_brow_time;

    @TableField("created")
    private Date created;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
