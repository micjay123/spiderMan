package com.shino.spider.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jsoup.nodes.Element;

import java.io.Serializable;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("juejin")
public class JueJin implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField("title")
    private String title;
    @TableField("link")
    private String link;
    @TableField("time")
    private Long time;
    @TableField("view")
    private Integer view;
    @TableField("content")
    private String content;
}
