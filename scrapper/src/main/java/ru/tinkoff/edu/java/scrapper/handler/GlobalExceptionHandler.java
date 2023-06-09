package ru.tinkoff.edu.java.scrapper.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.tinkoff.edu.java.scrapper.dto.responses.ApiErrorResponse;

import java.util.Arrays;
import java.util.Objects;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = HttpClientErrorException.BadRequest.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ApiErrorResponse> handleBadRequestException(Exception exception) {
        return handleException("Error! Bad request!", "400", exception);
    }

    @ExceptionHandler(value = HttpClientErrorException.NotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ApiErrorResponse> handleNotFoundException(Exception exception) {
        return handleException("Error! Not found!", "404", exception);
    }

    private ResponseEntity<ApiErrorResponse> handleException(String description, String code, Exception exception) {
        return new ResponseEntity<>(new ApiErrorResponse(description,
                code,
                exception.toString(),
                exception.getMessage(),
                Arrays.stream(exception.getStackTrace()).map(Objects::toString).toList()),
                HttpStatus.NOT_FOUND);
    }
}
