package dev.springfirst.tixora2025.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpUserResponseDTO {

    private String message;
    private ResponseStatus responseStatus;
    private int userId;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
