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
@TableName("vdata.vdata_report_teleplay")
@ApiModel(value = "VdataReportTeleplay对象", description = "")
public class VdataReportTeleplay extends Model<VdataReportTeleplay> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("teleplay")
    private Integer teleplay;

    @TableField("data_time")
    private LocalDate data_time;

    @TableField("baidutop_search_index_corr_sum")
    private Long baidutop_search_index_corr_sum;

    @TableField("baidunews_news_count_incr_sum")
    private Long baidunews_news_count_incr_sum;

    @TableField("baiduindex_search_index_pc_corr_sum")
    private Long baiduindex_search_index_pc_corr_sum;

    @TableField("baiduindex_search_index_mobile_corr_sum")
    private Long baiduindex_search_index_mobile_corr_sum;

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

    @TableField("douban_rating_corr_sum")
    private BigDecimal douban_rating_corr_sum;

    @TableField("douban_rating_count_incr_sum")
    private Long douban_rating_count_incr_sum;

    @TableField("douban_comment_count_incr_sum")
    private Long douban_comment_count_incr_sum;

    @TableField("douban_review_count_incr_sum")
    private Long douban_review_count_incr_sum;

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

    @TableField("youku_play_count_incr_sum")
    private Long youku_play_count_incr_sum;

    @TableField("tudou_play_count_incr_sum")
    private Long tudou_play_count_incr_sum;

    @TableField("letv_play_count_incr_sum")
    private Long letv_play_count_incr_sum;

    @TableField("mgtv_play_count_incr_sum")
    private Long mgtv_play_count_incr_sum;

    @TableField("iqiyi_play_count_incr_sum")
    private Long iqiyi_play_count_incr_sum;

    @TableField("sohu_play_count_incr_sum")
    private Long sohu_play_count_incr_sum;

    @TableField("qq_play_count_incr_sum")
    private Long qq_play_count_incr_sum;

    @TableField("iqiyi_hot_value_corr_sum")
    private Long iqiyi_hot_value_corr_sum;

    @TableField("youku_hot_value_corr_sum")
    private Long youku_hot_value_corr_sum;

    @TableField("huati_read_count_incr_sum")
    private Long huati_read_count_incr_sum;

    @TableField("huati_post_count_incr_sum")
    private Long huati_post_count_incr_sum;

    @TableField("huati_fan_count_incr_sum")
    private Long huati_fan_count_incr_sum;

    @TableField("report_play_count_incr_sum")
    private Long report_play_count_incr_sum;

    @TableField("report_1905_sum")
    private BigDecimal report_1905_sum;

    @TableField("oper_user")
    private Integer oper_user;

    @TableField("updated")
    private Date updated;

    @TableField("baidutop_search_index_rank_sum")
    private Long baidutop_search_index_rank_sum;

    @TableField("report_est_iqiyi_play_count_incr_sum")
    private Long report_est_iqiyi_play_count_incr_sum;

    @TableField("report_est_play_count_incr_sum")
    private Long report_est_play_count_incr_sum;

    @TableField("report_est_youku_play_count_incr_sum")
    private Long report_est_youku_play_count_incr_sum;

    @TableField("sotrend_rank_corr_sum")
    private Long sotrend_rank_corr_sum;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
