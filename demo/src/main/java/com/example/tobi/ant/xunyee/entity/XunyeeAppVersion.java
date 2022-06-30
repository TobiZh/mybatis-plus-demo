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
@TableName("xunyee.xunyee_app_version")
@ApiModel(value = "XunyeeAppVersion对象", description = "")
public class XunyeeAppVersion extends Model<XunyeeAppVersion> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("title")
    private String title;

    @TableField("version_name")
    private String version_name;

    @TableField("version_code")
    private Integer version_code;

    @TableField("update_message")
    private String update_message;

    @TableField("is_force")
    private Boolean is_force;

    @TableField("apk_download_url")
    private String apk_download_url;

    @TableField("updated")
    private Date updated;

    @TableField("created")
    private Date created;

    @TableField("is_deleted")
    private Boolean is_deleted;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
