package com.wangrunlin.maildemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页控制器
 *
 * @see com.wangrunlin.maildemo.controller.MailController
 * @author Leo[leo@wangrunlin.com]
 */
@RestController
public class IndexController {

    @RequestMapping({"", "index*"})
    public String index() {
        return "<p>请访问请求 <a href='/send'>/send</a></p>" +
                "<p><a href='https://github.com/wangrunlin/boot-mail-demo'>项目地址</a></p>";
    }

}
