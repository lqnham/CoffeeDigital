package com.coffee.digital.core.exception;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class CoffeeDigitalExceptionHandler extends ResponseEntityExceptionHandler {



    // 400
//    @Override
//    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex,
//                                      final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        //
//        final List<String> errors = new ArrayList<>();
//        for (final FieldError error : ex.getBindingResult().getFieldErrors()) {
//            errors.add(error.getField() + ": " + error.getDefaultMessage());
//        }
//        for (final ObjectError error : ex.getBindingResult().getGlobalErrors()) {
//            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
//        }
//        final CoffeeDigitalException coffeeDigitalException = new CoffeeDigitalException(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors);
//        return handleExceptionInternal(ex, coffeeDigitalException, headers, coffeeDigitalException.getStatus(), request);
//    }
//
//    @Override
//    protected ResponseEntity<Object> handleBindException(final BindException ex, final HttpHeaders headers,
//                                                         final HttpStatus status, final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        //
//        final List<String> errors = new ArrayList<>();
//        for (final FieldError error : ex.getBindingResult().getFieldErrors()) {
//            errors.add(error.getField() + ": " + error.getDefaultMessage());
//        }
//        for (final ObjectError error : ex.getBindingResult().getGlobalErrors()) {
//            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
//        }
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors);
//        return handleExceptionInternal(ex, CoffeeDigitalException, headers, CoffeeDigitalException.getStatus(), request);
//    }
//
//    @Override
//    protected ResponseEntity<Object> handleTypeMismatch(final TypeMismatchException ex, final HttpHeaders headers,
//                                                        final HttpStatus status, final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        final String error = ex.getValue() + " value for " + ex.getPropertyName() + " should be of type "
//                + ex.getRequiredType();
//
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
//
//    @Override
//    protected ResponseEntity<Object> handleMissingServletRequestPart(final MissingServletRequestPartException ex,
//                                     final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
//
//        logger.info(ex.getClass().getName());
//        //
//        final String error = ex.getRequestPartName() + " part is missing";
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
//
//    @Override
//    protected ResponseEntity<Object> handleMissingServletRequestParameter(
//            final MissingServletRequestParameterException ex, final HttpHeaders headers, final HttpStatus status,
//            final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        //
//        final String error = ex.getParameterName() + " parameter is missing";
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
//
//    //
//
//    @ExceptionHandler({MethodArgumentTypeMismatchException.class})
//    public ResponseEntity<Object> handleMethodArgumentTypeMismatch(final MethodArgumentTypeMismatchException ex,
//                                                                   final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        final String error = ex.getName() + " should be of type " + ex.getRequiredType().getName();
//
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
//
//    @ExceptionHandler({ConstraintViolationException.class})
//    public ResponseEntity<Object> handleConstraintViolation(final ConstraintViolationException ex,
//                                                            final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        //
//        final List<String> errors = new ArrayList<>();
//        for (final ConstraintViolation<?> violation : ex.getConstraintViolations()) {
//            errors.add(violation.getRootBeanClass().getName() + " " + violation.getPropertyPath() + ": "
//                    + violation.getMessage());
//        }
//
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors);
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
//
//    // 404
//
//    @Override
//    protected ResponseEntity<Object> handleNoHandlerFoundException(final NoHandlerFoundException ex,
//                                       final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        //
//        final String error = "No handler found for " + ex.getHttpMethod() + " " + ex.getRequestURL();
//
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), error);
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
//
//    // 405
//
//    @Override
//    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(final HttpRequestMethodNotSupportedException ex,
//                                                                         final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        //
//        final StringBuilder builder = new StringBuilder();
//        builder.append(ex.getMethod());
//        builder.append(" method is not supported for this request. Supported methods are ");
//        ex.getSupportedHttpMethods().forEach(t -> builder.append(t + " "));
//
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.METHOD_NOT_ALLOWED, ex.getLocalizedMessage(),
//                builder.toString());
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
//
//    // 415
//
//    @Override
//    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(final HttpMediaTypeNotSupportedException ex,
//                                     final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        //
//        final StringBuilder builder = new StringBuilder();
//        builder.append(ex.getContentType());
//        builder.append(" media type is not supported. Supported media types are ");
//        ex.getSupportedMediaTypes().forEach(t -> builder.append(t + " "));
//
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.UNSUPPORTED_MEDIA_TYPE, ex.getLocalizedMessage(), builder.substring(0, builder.length() - 2));
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
//
//    // 500
//
//    @ExceptionHandler({Exception.class})
//    public ResponseEntity<Object> handleAll(final Exception ex, final WebRequest request) {
//        logger.info(ex.getClass().getName());
//        logger.error("error", ex);
//        //
//        final CoffeeDigitalException CoffeeDigitalException = new CoffeeDigitalException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getLocalizedMessage(),
//                "error occurred");
//        return new ResponseEntity<>(CoffeeDigitalException, new HttpHeaders(), CoffeeDigitalException.getStatus());
//    }
}
