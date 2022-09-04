package com.book.manager.exception;

/**
 * 全局异常处理
 * @author panjinsheng
 * @date 2022/09/04/21:08
 */


import com.book.manager.util.R;
import com.book.manager.util.http.CodeEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        e.printStackTrace();
        return R.fail(CodeEnum.FAIL);
    }
}

