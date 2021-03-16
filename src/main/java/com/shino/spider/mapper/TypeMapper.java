package com.shino.spider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shino.spider.model.HotType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author langchaojie
 */
@Repository
public interface TypeMapper extends BaseMapper<HotType> {
}
