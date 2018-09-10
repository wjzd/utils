package com.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("ueditorController")
public class UeditorController {

    @RequestMapping("/getUeditorImg")
    public String getUeditorImg(String editorContent, HttpServletRequest req, HttpServletResponse resp){

        System.out.println("上传图片："+editorContent);

        req.setAttribute("editorContent",editorContent);
        System.out.println("路径："+editorContent);
//        JSONObject json=new JSONObject();
//        json.put("editorContent",editorContent);
//        PrintWriter out=null;
//        try {
//            out=resp.getWriter();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//       out.print(json);
//        out.flush();
//        out.close();

        return "/ueditorTest.jsp";
    }
}
