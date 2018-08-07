package com.serviceImpl;

import com.pojo.UserInfo;
import jxl.Sheet;
import jxl.Workbook;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StuService {

    /**
     * 查询指定目录中电子表格中所有的数据
     * @param file 文件完整路径
     * @return
     */
    public static List<UserInfo> getAllByExcel(String file){

        System.out.println(file);
        List<UserInfo> list=new ArrayList<UserInfo>();
        try {
            Workbook rwb=Workbook.getWorkbook(new File(file));
            Sheet rs=rwb.getSheet(0);//或者rwb.getSheet(0)
            int clos=rs.getColumns();//得到所有的列
            int rows=rs.getRows();//得到所有的行

            System.out.println(clos+" rows:"+rows);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < clos; j++) {
                    //第一个是列数，第二个是行数
                   //默认最左边编号也算一列 所以这里得j++
                    String name=rs.getCell(j++, i).getContents();


                    System.out.println(" name:"+name);
                    list.add(new UserInfo(name));
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;

    }
}
