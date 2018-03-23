package com.springboot.springboot.demo;

import com.springboot.springboot.configbean.WeixinPayConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * CREATED BY SchafferXu ON 2018/3/19 20:37
 */
@RestController
public class ConfigDemo {

    /*
    读取默认配置文件内容
     */
    @Value(value = "${wxpay.app_id}")
    private String app_id;
    @Value(value = "${wxpay.app_secret}")
    private String app_secret;


    /*
    读取自定义配置文件内容
     */
    @Autowired
    private WeixinPayConfigBean weiXinPayConfig;

    @RequestMapping(value = "/demo", produces = "text/plain;charset=UTF-8")
    String index() {
        return "This is a demo!" +
                "app_id is " + app_id + " and " +
                "appsecret is " + app_secret + " " +
                "weixin " + weiXinPayConfig.getApp_id() + " : " + weiXinPayConfig.getApp_secret();
    }
}
