package com.easygo.utils;


/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.utils
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-27 14:49
 * @Description: TODO
 */
public class MessageResults {

    private Integer code;
    private String message;


    public MessageResults(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public MessageResults() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
