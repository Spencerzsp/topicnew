package com.fsnip.topicdata.utils;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.fsnip.topicdata.model.CheckResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelUtils {

    /**
     * @Description 解析excel文件,并返回Map集合
     * @param  map 列名-字段名
     * @param  excelPath excel路径
     * @param  clz 实体类的class对象
     * @return 对象集合
     */
    public static List<?> excelImport(Map<String,String> map, String excelPath, Class<?> clz) {
        if ((map == null ||map.size() == 0) || StringUtils.isBlank(excelPath)){
            return null;
        }
        ExcelReader reader = ExcelUtil.getReader(excelPath);
        reader.setHeaderAlias(map);
        List<?> list = reader.read(1,2,2147483647,clz);
        return list;
    }

    public static void main(String[] args) {
      /*  Map<String,String> map = new HashMap<>();;
        //map.put("companyAdress","标称生产企业地址");
        map.put("标称生产企业地址","companyAdress");
        List list =  excelImport(map,"E:/top/检验检测/检验检测/P020190530362457717474/食品抽检合格-蛋制品.xls", CheckResult.class);
        System.out.println(list);*/
        int i= 10 ,j=101;

        int c = j/i;
        System.out.println(c);

    }
}
