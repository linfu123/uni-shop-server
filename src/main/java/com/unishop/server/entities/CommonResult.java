package com.unishop.server.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    public Integer code;
    public String message;
    public List<T> data;

    public CommonResult(Integer code, String message) {
       this(code,message,null);
    }
}
