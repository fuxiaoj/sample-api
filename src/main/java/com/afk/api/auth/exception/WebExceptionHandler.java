package com.afk.api.auth.exception;

import com.afk.api.auth.vo.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by @author fuxj on 2019-7-18 11:49
 */
@ControllerAdvice
@ResponseBody
public class WebExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(WebExceptionHandler.class);

    @ExceptionHandler
    public JsonResult runtimeException(RuntimeException e) {
        log.error("运行时发生异常", e);
        return JsonResult.failed(e.getMessage());
    }

    @ExceptionHandler
    public JsonResult unknownException(Exception e) {
        log.error("发生了异常", e);
        return JsonResult.failed("系统异常，请联系管理员");
    }
}
