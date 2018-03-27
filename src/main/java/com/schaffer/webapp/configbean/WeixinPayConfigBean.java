package com.schaffer.webapp.configbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/*
 * CREATED BY SchafferXu ON 2018/3/19 21:01
 */
@Component
@Configuration
@PropertySource("classpath:config/wxpayconfig.properties")
@ConfigurationProperties(prefix = "")
public class WeixinPayConfigBean {
    private String app_id;
    private String app_secret;

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public void setApp_secret(String app_secret) {
        this.app_secret = app_secret;
    }

    public String getApp_id() {
        return app_id;
    }

    public String getApp_secret() {
        return app_secret;
    }

}
