package com.book.manager.exception;

/**
 * @author panjinsheng
 * @date 2022/09/04/21:15
 */


import com.book.manager.util.http.CodeEnum;
import lombok.Data;

@Data
public class ServiceException extends RuntimeException {
    private Integer code;

    public ServiceException(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
    }
}