package com.fsnip.topicdata.utils;

import com.fsnip.topicdata.model.ResponseCode;
import com.fsnip.topicdata.model.ResponseMsg;
import org.apache.ibatis.javassist.NotFoundException;
import org.omg.CORBA.SystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/29.
 * @Modified By:
 */
@ControllerAdvice(annotations = RestController.class)
public class RestExceptionHandler
{
    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(SQLException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    private <T> ResponseMsg<T> sqlExceptionHandler(HttpServletRequest request, SQLException e)
    {
        LOGGER.error("sqlExceptionHandler", e);
        return ResponseMsg.generatorFailMsg("SQLException: 参数格式有误", ResponseCode.NOT_ACCEPTABLE.getCode());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    private <T> ResponseMsg<T> methodArgumentNotValidExceptionHandler(
        HttpServletRequest request, MethodArgumentNotValidException e)
    {
        LOGGER.error("methodArgumentNotValidExceptionHandler", e);
        return ResponseMsg.generatorFailMsg("methodArgumentNotValidExceptionHandler:服务器发生错误",
            ResponseCode.INTERNAL_SERVER_ERROR.getCode());
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    private <T> ResponseMsg<T> notFoundExceptionHandler(HttpServletRequest request, NotFoundException e)
    {
        LOGGER.error("notFoundExceptionHandler", e);
        return ResponseMsg.generatorFailMsg("notFoundExceptionHandler:没有访问资源",
            ResponseCode.NOT_FOUND.getCode());
    }

    @ExceptionHandler(SystemException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    private <T> ResponseMsg<T> systemExceptionHandler(HttpServletRequest request, SystemException e)
    {
        LOGGER.error("systemExceptionHandler", e);
        return ResponseMsg.generatorFailMsg("systemExceptionHandler:系统繁忙，请稍后重试",
            ResponseCode.SYSTEM_INNER_ERROR.getCode());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    private <T> ResponseMsg<T> exceptionHandler(HttpServletRequest request, Exception e)
    {
        LOGGER.error("exceptionHandler", e);
        return ResponseMsg.generatorFailMsg("exceptionHandler:参数格式有误",
            ResponseCode.NOT_ACCEPTABLE.getCode());
    }
}
