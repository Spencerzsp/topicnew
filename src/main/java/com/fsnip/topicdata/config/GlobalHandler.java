package com.fsnip.topicdata.config;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@ControllerAdvice
public class GlobalHandler {
	
/*
	@InitBinder
    public void initBinder(WebDataBinder binder) {
//        System.out.println("============处理所有@RequestMapping注解方法，在其执行之前初始化数据绑定器");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        binder.registerCustomEditor(LocalDateTime.class, new CustomDateEditor(dateFormat, true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
*/

}
