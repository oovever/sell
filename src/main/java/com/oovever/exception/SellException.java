package com.oovever.exception;

import com.oovever.enums.ResultEnum;

/**
 * @Author OovEver
 * @Date 2017/12/4 15:08
 */
public class SellException extends RuntimeException {

    private Integer code;
    private String message;
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
