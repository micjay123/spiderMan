package com.shino.spider.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("hot_type")
@Builder
public class HotType implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "type_id",type = IdType.AUTO)
    private int typeId;
    @TableField("source_name")
    private String sourceName;
    @TableField("description")
    private String description;
    @TableField("is_del")
    private short isDel;
}
