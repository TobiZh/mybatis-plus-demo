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
 * 
 * </p>
 *
 * @author tobi
 * @since 2021-11-09
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("xunyee.xunyee_blog")
@ApiModel(value = "XunyeeBlog对象", description = "")
public class XunyeeBlog extends Model<XunyeeBlog> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户id")
    @TableField("vcuser_id")
    private Integer vcuser_id;

    @ApiModelProperty("艺人id")
    @TableField("person_id")
    private Integer person_id;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("图片地址多张 用英文逗号隔开")
    @TableField("images")
    private String images;

    @ApiModelProperty("内容至少5个字符")
    @TableField("content")
    private String content;

    @ApiModelProperty("动态类型 1 截屏 2 我在现场 3 品牌代言")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("类型 id")
    @TableField("type_id")
    private Integer type_id;

    @ApiModelProperty("创作状态  0 草稿箱 1 正常发布 2 管理员删除")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("点赞数")
    @TableField("star_count")
    private Integer star_count;

    @ApiModelProperty("点踩数")
    @TableField("unstar_count")
    private Integer unstar_count;

    @ApiModelProperty("收藏数")
    @TableField("favorite_count")
    private Integer favorite_count;

    @ApiModelProperty("被举报次数")
    @TableField("report_count")
    private Integer report_count;

    @ApiModelProperty("删除时间")
    @TableField("deleted_time")
    private Date deleted_time;

    @ApiModelProperty("更新时间")
    @TableField("updated")
    private Date updated;

    @ApiModelProperty("发布时间")
    @TableField("created")
    private Date created;

    @ApiModelProperty("删除原因")
    @TableField("deleted_reason")
    private String deleted_reason;

    @ApiModelProperty("是否删除")
    @TableField("is_deleted")
    private Boolean is_deleted;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
