package com.afk.api.auth.vo;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * Created by @author fuxj on 2019-7-17 15:46
 */
@Data
public class ResponseMessage<T> {

    private Boolean status;
    private int code;
    private String message;
    private T result;

    public ResponseMessage() {
    }

    public static ResponseMessage<String> failed(String message, HttpStatus httpStatus) {
        ResponseMessage<String> responseMessage = new ResponseMessage<>();
        responseMessage.status = Boolean.FALSE;
        responseMessage.message = httpStatus.getReasonPhrase();
        responseMessage.result = message;
        responseMessage.code = httpStatus.value();
        return responseMessage;
    }

    public static ResponseMessage<Object> success(Object result, HttpStatus httpStatus) {
        ResponseMessage<Object> responseMessage = new ResponseMessage<>();
        responseMessage.status = Boolean.TRUE;
        responseMessage.message = httpStatus.getReasonPhrase();
        responseMessage.result = result;
        responseMessage.code = httpStatus.value();
        return responseMessage;
    }

}
