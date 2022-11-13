package com.zhl.stater.service;

import com.zhl.stater.config.Properties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 定义一个测试业务类
 */
@Slf4j
public class PlayService {

    @Autowired
    private Properties properties;

    public String zhlPlay() {
        log.info("yml信息为：{}，{}，{}", properties.getName(), properties.getAge(), properties.getPlay());
        return properties.getName() + "今年：" + properties.getAge() + "岁了,喜欢：" + properties.getPlay();
    }

}
