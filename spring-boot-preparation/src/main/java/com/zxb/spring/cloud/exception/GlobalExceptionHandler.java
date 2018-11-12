package com.zxb.spring.cloud.exception;

import com.zxb.spring.cloud.vo.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局处理异常
 * @author Mr.zxb
 * @date 2018-11-12 16:17
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest request, Exception e) {
        logger.error("error", e);

        ResponseData data = new ResponseData();

        data.setMessage(e.getMessage());
        if (e instanceof NoHandlerFoundException) {
            data.setCode(404);
        } else {
            data.setCode(500);
        }

        data.setData(null);
        data.setStatus(false);

        return data;
    }
}
