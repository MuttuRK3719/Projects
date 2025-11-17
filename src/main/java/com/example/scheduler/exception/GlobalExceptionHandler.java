package com.example.scheduler.exception;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*;
@RestControllerAdvice
public class GlobalExceptionHandler {
 @ExceptionHandler(ApiException.class)
 public ResponseEntity<String> handleApi(ApiException ex){
  return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
 }
}