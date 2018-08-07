package com.utils;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailUtil {

    /**
     *
     * @param to 邮件发送给谁
     * @param text 邮件的内容
     * @return
     * @throws MessagingException
     */
    public static boolean send(String to,String text) throws MessagingException {

        //设置连接对象连接到邮件服务器
        Properties properties=new Properties();

        //设置发送邮件的基本参数
        properties.put("mail.transport.protocol","smtp");//连接协议
        //发送邮件服务器
        properties.put("mail.smtp.host","smtp.qq.com");
        properties.put("mail.smtp.port", 465);  // 端口号
        //发送端口
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.ssl.enable", "true");  // 设置是否使用ssl安全连接 (一般都使用)
        properties.put("mail.debug", "true"); // 设置是否显示debug信息 true 会在控制台显示相关信息
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        // 得到回话对象
        Session session = Session.getInstance(properties);
        // 获取邮件对象
        Message message = new MimeMessage(session);
        // 设置发件人邮箱地址
        message.setFrom(new InternetAddress("1300940071@qq.com"));
        // 设置收件人地址
        message.setRecipients(Message.RecipientType.TO, new InternetAddress[] { new InternetAddress(to) });
        // 设置邮件标题
        message.setSubject("意中人婚恋网");

        // 设置邮件内容
        message.setContent(text,"text/html;Charset=UTF-8");
        // 得到邮差对象
        Transport transport = session.getTransport();
        // 连接自己的邮箱账户
        transport.connect("1300940071@qq.com", "ttkchjztncaojafg"); //密码为刚才得到的授权码
        // 发送邮件
        transport.sendMessage(message, message.getAllRecipients());
        return true;
    }

}
