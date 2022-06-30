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
@TableName("xunyee.xunyee_system_notification")
@ApiModel(value = "XunyeeSystemNotification对象", description = "")
public class XunyeeSystemNotification extends Model<XunyeeSystemNotification> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("接收用户 id 0 发送给所有人")
    @TableField("receive_vcuser_id")
    private Integer receive_vcuser_id;

    @ApiModelProperty("通知标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("通知内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("状态 0 未读 1已读")
    @TableField("is_read")
    private Integer is_read;

    @TableField("read_time")
    private Date read_time;

    @ApiModelProperty("创建时间")
    @TableField("created")
    private Date created;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
