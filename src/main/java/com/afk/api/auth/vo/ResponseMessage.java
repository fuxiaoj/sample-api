package com.afk.api.auth.vo;

import lombok.Data;

/**
 * Created by @author fuxj on 2019-7-17 15:46
 */
@Data
public class ResponseMessage<T> {

    private Boolean status;
    private String message;
    private T resultBody;

    public ResponseMessage() {
        this(Boolean.TRUE);
    }

    public ResponseMessage(boolean status) {
        this.status = status;
    }

    public ResponseMessage(T resultBody) {
        this.status = Boolean.TRUE;
        this.resultBody = resultBody;
    }

    public static ResponseMessage<String> failed(String message) {
        ResponseMessage<String> responseMessage = new ResponseMessage<>();
        responseMessage.status = Boolean.FALSE;
        responseMessage.message = message;
        responseMessage.resultBody = message;
        return responseMessage;
    }
}
