/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.exception;

/**
 * Представитель BuisnessException. 
 * Если произошла ошибка валидации данных то мы
 * должны информировать пользователя чтобы он ввел корректные параметры
 * @author chemp
 */
public class ValidationException extends BuisnessException{

    public ValidationException(String message) {
        super(message);
    }
    
    
}
