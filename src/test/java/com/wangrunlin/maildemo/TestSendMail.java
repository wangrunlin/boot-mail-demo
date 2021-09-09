package com.wangrunlin.maildemo;

import com.wangrunlin.maildemo.property.MailProperty;
import org.junit.jupiter.api.Test;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.annotation.Resource;

/**
 * 邮件发送
 *
 * @author Leo[leo@wangrunlin.com]
 */
public class TestSendMail {

    @Resource
    private JavaMailSender mailSender;

    @Test
    void testSend() {
        // 发件人
        // qq 邮箱需与邮箱一致
        String from = "Test";
        // 收件人
        String to = "leo@alin.run";
        // 主题
        String subject = "测试";
        // 内容
        String text = "测试内容";

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(text);

        mailSender.send(mailMessage);
    }

}
