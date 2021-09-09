package com.wangrunlin.maildemo.controller;

import com.wangrunlin.maildemo.property.MailProperty;
import com.wangrunlin.maildemo.service.MailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 邮件控制器
 *
 * @author Leo
 */
@RestController
public class MailController {

    @Resource
    private MailService mailService;

    @Resource
    private MailProperty mailProperty;

    @RequestMapping(value = "send", method = {RequestMethod.GET, RequestMethod.POST})
    public String sendMail(String to, String subject, String text) {
        if (to == null) to = mailProperty.getTo();
        if (subject == null) subject = mailProperty.getSubject();
        if (text == null) text = mailProperty.getText();

        return mailService.sendSimpleMail(to, subject, text) ? "发送成功" : "发送失败";
    }

}
