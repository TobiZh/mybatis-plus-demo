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
@TableName("xunyee.xunyee_feedback")
@ApiModel(value = "XunyeeFeedback对象", description = "")
public class XunyeeFeedback extends Model<XunyeeFeedback> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("被举报人id")
    @TableField("vcuser_id")
    private Integer vcuser_id;

    @ApiModelProperty("举报原因")
    @TableField("title")
    private String title;

    @ApiModelProperty("补充说明")
    @TableField("content")
    private String content;

    @ApiModelProperty("相关截图")
    @TableField("images")
    private String images;

    @ApiModelProperty("状态  0 未处理 ; 1 已处理")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("处理反馈文字说明")
    @TableField("feedback")
    private String feedback;

    @ApiModelProperty("更新时间")
    @TableField("updated")
    private Date updated;

    @ApiModelProperty("创建时间")
    @TableField("created")
    private Date created;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
