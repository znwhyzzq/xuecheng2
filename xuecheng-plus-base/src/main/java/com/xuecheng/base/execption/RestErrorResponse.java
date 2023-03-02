package com.xuecheng.base.execption;

import java.io.Serializable;

/**
 * 错误响应参数包装
 * @author ZZQ
 * @Date 2023/2/27
 * @apiNote
 */
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
