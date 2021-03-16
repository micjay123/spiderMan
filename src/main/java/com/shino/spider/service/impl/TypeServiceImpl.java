package com.shino.spider.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shino.spider.mapper.TypeMapper;
import com.shino.spider.model.HotType;
import com.shino.spider.restfulcode.ResultJson;
import com.shino.spider.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, HotType> implements TypeService {
    @Resource
    private TypeService typeService;
    /**
     * 获取所有的热搜类型
     * @return 热搜类型
     */

    @Override
    public List<HotType> getAllType() {
        LambdaQueryWrapper<HotType> lambda = new LambdaQueryWrapper<>();
        lambda.select(HotType::getTypeId,HotType::getSourceName).eq(HotType::getIsDel,1);
        return typeService.list(lambda);
    }

    @Override
    public void addType(HotType hotType) {
        hotType.setIsDel((byte) 1);
        typeService.save(hotType);
    }

    @Override
    public void removeOneType(Integer typeId) {
        LambdaUpdateWrapper<HotType> lambda = new LambdaUpdateWrapper<>();
        lambda.set(HotType::getIsDel,0).eq(HotType::getTypeId,typeId);
        typeService.update(lambda);
    }
}
