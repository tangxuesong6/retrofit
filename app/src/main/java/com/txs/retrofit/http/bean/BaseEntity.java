package com.txs.retrofit.http.bean;

/**
 * @description 解析实体基类!
 */

public class BaseEntity<T> {
    /**
     * flag : success
     * msg : 操作成功
     * data : {}
     * success : true
     */

    private String flag;
    private String msg;
    private  T data;
    private boolean success;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
    }


//    private static int SUCCESS_CODE=200;//成功的code
//    private int code;
//    private String msg;
////    private T data;
//    /**
//     * flag : error
//     * data : null
//     * success : false
//     */
//
//    private String flag;
//    @SerializedName("data")
//    private T dataX;
//    private boolean success;
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
//
//
//    public String getFlag() {
//        return flag;
//    }
//
//    public void setFlag(String flag) {
//        this.flag = flag;
//    }
//
//    public Object getDataX() {
//        return dataX;
//    }
//
//    public void setDataX(Object dataX) {
//        this.dataX = dataX;
//    }
//
//    public boolean isSuccess() {
//        return success;
//    }
//
//    public void setSuccess(boolean success) {
//        this.success = success;
//    }
}
