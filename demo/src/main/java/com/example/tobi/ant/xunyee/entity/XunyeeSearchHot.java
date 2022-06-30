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
@TableName("xunyee.xunyee_search_hot")
@ApiModel(value = "XunyeeSearchHot对象", description = "")
public class XunyeeSearchHot extends Model<XunyeeSearchHot> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("搜索名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("排序")
    @TableField("orderby")
    private Integer orderby;

    @ApiModelProperty("是否删除")
    @TableField("is_deleted")
    private Boolean is_deleted;

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
