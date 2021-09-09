# SpringBoot 邮件发送演示

## 配置

编辑配置文件 `src/main/resources/application.yml`
将 to 修改为收件人邮箱


## 如何运行

任选其一即可

1. 运行 src.test.java.com.wangrunlin.maildemo.TestSendMail.testSendSimpleMail() 方法
2. 运行 src.test.java.com.wangrunlin.maildemo.TestMailService.testSend() 方法
3. 运行 SpringMailApplication，打开网址 http://localhost:9750/send 默认收件人为**配置文件**的 `to`
4. 运行 SpringMailApplication，打开网址 http://localhost:9750/send?to=email , 将 email 替换为收件人邮箱


## 注意 ⚠️

将此项目集成到自己的项目时，请修改 username 和 password


## 最简化代码

方法 1
```java
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
```