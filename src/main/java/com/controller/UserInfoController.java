package com.controller;

import com.pojo.UserInfo;
import com.service.UserInfoInterface;
import com.serviceImpl.StuService;
import com.utils.ExcelDownload;
import com.utils.ExcelUpload;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
@RequestMapping("userController")
public class UserInfoController {

    @Resource
    private UserInfoInterface userInfoInterface;

    /**
     * 文件下载
     * @param response
     */
    @RequestMapping("/exceldownload")
    public void test(HttpServletResponse response){
        System.out.println("1111111111111");
        Integer id=3;
        UserInfo userInfo=userInfoInterface.user(id);
        System.out.println("用户名："+userInfo);

        List<UserInfo> list = userInfoInterface.userlist();
        String excelName="用户信息";
        LinkedHashMap<String, String> fieldMap=new LinkedHashMap<String, String>();
        fieldMap.put("id","编号" );
        fieldMap.put("name", "姓名");
        fieldMap.put("sex", "年龄");
        fieldMap.put("num","工资" );
        System.out.println("下载前。。。。。。。。。。。。。。。。。。");
        ExcelDownload.export(excelName, list, fieldMap, response);
        System.out.println("下载后。。。。。。。。。。。。。。。。。。");

    }

    /**
     * 文件上传
     * @param file
     * @param num
     */
    @RequestMapping("/upload" )
    public String upload(MultipartFile file,Integer num){
        System.out.println("444444");
        ExcelUpload excelUpload=new ExcelUpload();

        System.out.println("num的值为："+num);
        System.out.println("文件："+file);
        List<UserInfo> list=excelUpload.getExcelInfo(file);
        System.out.println("集合的长度："+list.size());
        System.out.println("文件："+file);

        return "login.jsp";
    }
    @RequestMapping("/test")
    public void test(@RequestParam(value="file",required = false)File file){
        System.out.println("111111111");
        System.out.println("file:"+file);
    }

    @Test
    public void test(){
        //得到表格中所有的数据
        List<UserInfo> listExcel=StuService.getAllByExcel("e://test.xls");

        File file=new File("e://test.xls");
        System.out.println(file);
        System.out.println("集合长度："+listExcel.size());
    }

}
