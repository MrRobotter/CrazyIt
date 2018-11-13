package com.joinyon.crazyit.testbasemodule.bean;

import java.io.Serializable;

public class BaseBean implements Serializable {
    private String msg;
    private String code;
    private String newFileName;
    private boolean success;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", newFileName='" + newFileName + '\'' +
                ", success=" + success +
                '}';
    }
}
