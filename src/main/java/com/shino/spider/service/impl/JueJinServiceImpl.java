package com.shino.spider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shino.spider.mapper.JueJinMapper;
import com.shino.spider.model.JueJin;
import com.shino.spider.service.JueJinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
@Service
public class JueJinServiceImpl extends ServiceImpl<JueJinMapper, JueJin> implements JueJinService {
    @Resource
    private JueJinService jueJinService;
    @Override
    public void save2db(List<JueJin> jueJins,int view) {
        if (!jueJins.isEmpty()) {
            jueJins.forEach(jueJin -> {
                if (jueJin.getView()>view){
                    jueJinService.save(jueJin);
                }
            });
        }else {
            System.out.println("列表为空!!!");
        }
    }
}
