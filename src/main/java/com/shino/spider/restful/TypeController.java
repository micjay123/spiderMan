package com.shino.spider.restful;

import com.shino.spider.model.HotType;
import com.shino.spider.restfulcode.ResultJson;
import com.shino.spider.service.TypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
@RestController
@RequestMapping("/api/hotType/v1")
public class TypeController {
    @Resource
    private TypeService typeService;

    @GetMapping("/getAllType")
    public ResultJson getAllType(){
        List<HotType> hotTypes = typeService.getAllType();

        return !hotTypes.isEmpty()? new ResultJson<List<HotType>>(666,"typelist is got!",hotTypes):
                new ResultJson(999,"type list is got failed...");
    }

    @PostMapping("/saveOneType")
    public ResultJson saveOneType(HotType hotType){
        if (hotType!=null){
            typeService.addType(hotType);
            return new ResultJson(666,"类型添加成功!");
        }
        return new ResultJson(999,"添加失败");
    }

    @DeleteMapping("/deleteOneType")
    public ResultJson deleteOneType(Integer typeId){
        if (typeId!=null){
            typeService.removeOneType(typeId);
            return new ResultJson(666,"类型删除成功!");
        }

        return new ResultJson(999,"删除类型失败!");
    }
}
