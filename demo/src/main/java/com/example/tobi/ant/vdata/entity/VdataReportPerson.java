package com.example.tobi.ant.vdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("vdata.vdata_report_person")
@ApiModel(value = "VdataReportPerson对象", description = "")
public class VdataReportPerson extends Model<VdataReportPerson> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("person")
    private Integer person;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("baidutop_search_index_corr_sum")
    private Long baidutop_search_index_corr_sum;

    @TableField("baidutop_search_index_rank_sum")
    private Long baidutop_search_index_rank_sum;

    @TableField("baiduindex_search_index_pc_corr_sum")
    private Long baiduindex_search_index_pc_corr_sum;

    @TableField("baiduindex_search_index_mobile_corr_sum")
    private Long baiduindex_search_index_mobile_corr_sum;

    @TableField("sotrend_rank_corr_sum")
    private Long sotrend_rank_corr_sum;

    @TableField("sotrend_hot_value_corr_sum")
    private Long sotrend_hot_value_corr_sum;

    @TableField("sotrend_search_index_corr_sum")
    private Long sotrend_search_index_corr_sum;

    @TableField("sotrend_media_index_corr_sum")
    private Long sotrend_media_index_corr_sum;

    @TableField("buluo_post_count_incr_sum")
    private Long buluo_post_count_incr_sum;

    @TableField("buluo_focus_count_incr_sum")
    private Long buluo_focus_count_incr_sum;

    @TableField("douban_fan_count_incr_sum")
    private Long douban_fan_count_incr_sum;

    @TableField("tieba_topic_count_incr_sum")
    private Long tieba_topic_count_incr_sum;

    @TableField("tieba_post_count_incr_sum")
    private Long tieba_post_count_incr_sum;

    @TableField("tieba_member_count_incr_sum")
    private Long tieba_member_count_incr_sum;

    @TableField("weibo_follow_count_incr_sum")
    private Long weibo_follow_count_incr_sum;

    @TableField("weibo_fan_count_incr_sum")
    private Long weibo_fan_count_incr_sum;

    @TableField("weibo_post_count_incr_sum")
    private Long weibo_post_count_incr_sum;

    @TableField("huati_read_count_incr_sum")
    private Long huati_read_count_incr_sum;

    @TableField("huati_post_count_incr_sum")
    private Long huati_post_count_incr_sum;

    @TableField("huati_fan_count_incr_sum")
    private Long huati_fan_count_incr_sum;

    @TableField("report_teleplay_est_play_count_incr_sum")
    private Long report_teleplay_est_play_count_incr_sum;

    @TableField("report_zy_est_play_count_incr_sum")
    private Long report_zy_est_play_count_incr_sum;

    @TableField("report_1905_teleplay_sum")
    private BigDecimal report_1905_teleplay_sum;

    @TableField("report_1905_zy_sum")
    private BigDecimal report_1905_zy_sum;

    @TableField("oper_user")
    private Integer oper_user;

    @TableField("updated")
    private Date updated;

    @TableField("huati_exclusive_fan_count_incr_sum")
    private Long huati_exclusive_fan_count_incr_sum;

    @TableField("huati_exclusive_post_count_incr_sum")
    private Long huati_exclusive_post_count_incr_sum;

    @TableField("huati_exclusive_read_count_incr_sum")
    private Long huati_exclusive_read_count_incr_sum;

    @TableField("report_1912_teleplay_sum")
    private BigDecimal report_1912_teleplay_sum;

    @TableField("report_1912_zy_sum")
    private BigDecimal report_1912_zy_sum;

    @TableField("xunyee_check_sum")
    private Long xunyee_check_sum;

    @TableField("jd_cos_fee_sum")
    private BigDecimal jd_cos_fee_sum;

    @TableField("jd_cos_price_sum")
    private BigDecimal jd_cos_price_sum;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
