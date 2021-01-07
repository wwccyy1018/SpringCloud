package com.wcy.springcloud.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2020/12/28 17:54
 * 4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private  T     dara;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
