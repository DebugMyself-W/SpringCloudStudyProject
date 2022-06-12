package com.debugmyself.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月09日 14:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    private CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
