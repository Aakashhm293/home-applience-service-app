package com.excel.homeas.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response<T> {
    private T data;
    private boolean isError;
    private String message;
}
