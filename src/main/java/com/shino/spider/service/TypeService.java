package com.shino.spider.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shino.spider.model.HotType;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author langchaojie
 */

public interface TypeService extends IService<HotType> {
    /**
     *  获取所有热搜类型
     * @return 获取热搜类型
     */
    List<HotType> getAllType();

    /**
     * 添加热搜对象
     * @param hotType 热搜对象
     */
    void addType(HotType hotType);

    /**
     * 删除一个类型
     * @param typeId 类型id
     */
    void removeOneType(Integer typeId);
}
