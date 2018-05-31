package com.example.sericefeign;

import com.example.sericefeign.redisserver.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name+"::feign");
    }
    @RequestMapping("testRedis")
    public String testRedis(@RequestParam String name){
        redisUtil.set("test:name", name);
        return "成功获取"+redisUtil.get("test:name");
    }
}