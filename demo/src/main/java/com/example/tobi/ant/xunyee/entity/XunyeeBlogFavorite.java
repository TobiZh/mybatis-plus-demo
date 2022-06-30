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
 * 动态收藏
 * </p>
 *
 * @author tobi
 * @since 2021-11-09
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("xunyee.xunyee_blog_favorite")
@ApiModel(value = "XunyeeBlogFavorite对象", description = "动态收藏")
public class XunyeeBlogFavorite extends Model<XunyeeBlogFavorite> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("创作id")
    @TableField("blog_id")
    private Integer blog_id;

    @ApiModelProperty("用户id")
    @TableField("vcuser_id")
    private Integer vcuser_id;

    @ApiModelProperty("状态 0 取消收藏; 1 已收藏")
    @TableField("status")
    private Integer status;

    @TableField("updated")
    private Date updated;

    @TableField("created")
    private Date created;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
