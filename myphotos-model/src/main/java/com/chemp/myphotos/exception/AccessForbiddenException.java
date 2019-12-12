/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.exception;

/**
 * Представитель BuisnessException.
 * Говорит о том что произошло нарушение правил доступа. Пользователь пытается получить
 * доступ к ресурсу на который он не авторизирован.
 * @author chemp
 */
public class AccessForbiddenException extends BuisnessException{

    public AccessForbiddenException(String message) {
        super(message);
    }
    
}
