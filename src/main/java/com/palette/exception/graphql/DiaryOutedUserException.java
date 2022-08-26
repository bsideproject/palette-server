package com.palette.exception.graphql;

import com.palette.exception.common.GlobalErrorType;
import com.palette.exception.common.GraphqlException;
import org.springframework.http.HttpStatus;

public class DiaryOutedUserException extends GraphqlException {

    public DiaryOutedUserException() {
        super(HttpStatus.BAD_REQUEST, GlobalErrorType.D005);
    }
}



