package com.shino.spider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shino.spider.model.JueJin;

import java.util.List;


/**
 * @author langchaojie
 * @date 2021/3/16
 */
public interface JueJinService extends IService<JueJin> {
    /**
     * 保存到数据库
     * @param jueJins 每一个掘金文章
     * @param view 设定爬取文章的阅读量最小值
     */
    void save2db(List<JueJin> jueJins,int view);
}
