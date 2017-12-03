package com.oovever.VO;

import lombok.Data;

/**
 * @Author OovEver
 * @Date 2017/12/3 21:59
 */
@Data
public class ResultVO<T> {
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
