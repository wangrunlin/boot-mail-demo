package com.wangrunlin.maildemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页控制器
 *
 * @see com.wangrunlin.maildemo.service.MailService
 * @author Leo[leo@wangrunlin.com]
 */
@RestController
public class IndexController {

    @RequestMapping({"", "index*"})
    public String index() {
        return "Please request /send";
    }

}
