package com.wangrunlin.maildemo;

import com.wangrunlin.maildemo.property.MailProperty;
import com.wangrunlin.maildemo.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 邮件发送测试类
 *
 * @author Leo[leo@wangrunlin.com]
 */
@SpringBootTest
public class TestMailService {

    @Resource
    private MailService mailService;

    @Resource
    private MailProperty mailProperty;

    @Test
    void testSendSimpleMail() {
        // 收件人
        String to = mailProperty.getTo();
        // 主题
        String subject = mailProperty.getSubject();
        // 内容
        String text = mailProperty.getText();

        mailService.sendSimpleMail(to, subject, text);
    }

}
