package com.shino.spider;

import com.shino.spider.mapper.TypeMapper;
import com.shino.spider.model.HotType;
import com.shino.spider.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    private TypeMapper typeMapper;
    @Resource
    private TypeService typeService;
    @Test
    void contextLoads() {
        List<HotType> hotTypes = typeMapper.selectList(null);
        List<HotType> hots = typeService.list();
        hots.forEach(System.out::println);
    }

}
