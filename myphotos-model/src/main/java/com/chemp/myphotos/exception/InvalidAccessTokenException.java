/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.exception;

/**
 * Представитель BuisnessException.
 * Возникает когда пользователь пытается получить доступ к приложению по некоректному 
 * аксес токену
 * @author chemp
 */
public class InvalidAccessTokenException extends BuisnessException{

    public InvalidAccessTokenException(String message) {
        super(message);
    }
    
}
