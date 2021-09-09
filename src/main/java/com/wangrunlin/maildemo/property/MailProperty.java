package com.wangrunlin.maildemo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 邮件配置类
 *
 * @author Leo[leo@wangrunlin.com]
 */
@Data
@Component
@ConfigurationProperties("spring.mail")
public class MailProperty {

    /**
     * 默认收件人
     */
    private String to;

    /**
     * 默认主题
     */
    private String subject;

    /**
     * 默认内容
     */
    private String text;

}
