package com.sky.controller;

import com.sky.config.WeChatConfig;
import com.sky.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private WeChatConfig weChatConfig;

    @RequestMapping("test")
    public String test() {
        return weChatConfig.getAppId() + ":" + weChatConfig.getAppsecret();
    }

    @RequestMapping("findAll")
    public Object findAll() {
        return videoMapper.findAll();
    }

}
