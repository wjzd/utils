package com.controller;

import com.aliyuncs.exceptions.ClientException;
import com.api.SmsDemo;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class DuanxinController {

    @RequestMapping("/duanxin")
    public void dxmethod(String tel, HttpServletResponse resp){

        //生成4位随机数
        int num=(int)((Math.random()*9+1)*1000);
        SmsDemo smsDemo=new SmsDemo();

        try {
            //调用短信接口方法
            smsDemo.sendSms(tel,num);
        } catch (ClientException e) {
            e.printStackTrace();
        }

        JSONObject json=new JSONObject();
        json.put("code",num);

        PrintWriter out= null;
        try {
            out = resp.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.print(json);

        out.flush();
        out.close();
    }

}
