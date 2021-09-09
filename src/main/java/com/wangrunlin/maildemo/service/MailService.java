package com.wangrunlin.maildemo.service;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 邮件服务
 *
 * @see com.wangrunlin.maildemo.controller.MailController
 * @author Leo
 */
@Service
public class MailService {

    @Resource
    private JavaMailSenderImpl mailSender;

    /**
     * 发送简单邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param text    内容
     * @return boolean
     */
    public boolean sendSimpleMail(String to, String subject, String text) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            assert mailSender.getUsername() != null;
            mailMessage.setFrom(mailSender.getUsername());
            mailMessage.setTo(to);
            mailMessage.setSubject(subject);
            mailMessage.setText(text);

            mailSender.send(mailMessage);

            System.out.println("Success send mail to " + to);
            return true;
        } catch (MailException e) {
            e.printStackTrace();
            return false;
        }
    }
}
