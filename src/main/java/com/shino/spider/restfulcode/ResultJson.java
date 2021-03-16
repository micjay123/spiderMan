package com.shino.spider.restfulcode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultJson<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer code;
    private String message;
    private T data;

    public ResultJson(int code, String msg) {
        this.code = code;
        this.message = msg;
    }
}
