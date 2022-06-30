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
@TableName("xunyee.xunyee_vcuser_report")
@ApiModel(value = "XunyeeVcuserReport对象", description = "")
public class XunyeeVcuserReport extends Model<XunyeeVcuserReport> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("发起举报用户id")
    @TableField("vcuser_id")
    private Integer vcuser_id;

    @ApiModelProperty("被举报用户id")
    @TableField("report_vcuser_id")
    private Integer report_vcuser_id;

    @ApiModelProperty("举报比标题 类型")
    @TableField("title")
    private String title;

    @ApiModelProperty("举报内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("图片地址")
    @TableField("images")
    private String images;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("反馈内容")
    @TableField("feedback")
    private String feedback;

    @TableField("updated")
    private Date updated;

    @TableField("created")
    private Date created;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
