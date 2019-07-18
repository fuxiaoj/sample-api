package com.afk.api.auth.vo;

/**
 * Created by @author fuxj on 2019-7-17 15:46
 */
public class JsonResult<T> {

    private Boolean result;
    private T data;
    private String error;

    public JsonResult() {
        this.result = Boolean.TRUE;
    }

    public JsonResult(T data) {
        this.result = Boolean.TRUE;
        this.data = data;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static <T> JsonResult<T> build(T data) {
        return new JsonResult<>(data);
    }

    public static <T> JsonResult<T> build() {
        return new JsonResult<>();
    }

    public static JsonResult<String> failed(String error) {
        JsonResult<String> jsonResult = new JsonResult<>();
        jsonResult.result = Boolean.FALSE;
        jsonResult.error = error;
        jsonResult.data = error;
        return jsonResult;
    }
}
