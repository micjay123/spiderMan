package com.shino.spider;

import com.shino.spider.mapper.TypeMapper;
import com.shino.spider.model.HotType;
import com.shino.spider.model.JueJin;
import com.shino.spider.service.JueJinService;
import com.shino.spider.service.TypeService;
import com.shino.spider.spider.JueJinCrawler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    private TypeMapper typeMapper;
    @Resource
    private TypeService typeService;
    @Resource
    private JueJinService jueJinService;
    @Test
    void contextLoads() {
        JueJin jueJin = JueJinCrawler.cleanData("https://juejin.cn/post/6939766986125623304");
        List<JueJin> jueJins = new ArrayList<>();
        jueJins.add(jueJin);
        jueJinService.save2db(jueJins,500);
    }

}
