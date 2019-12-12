/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.exception;

/**
 * Представитель ApplicationException.
 * Когда польззователь будет проходить аунтентификацию через социальные сети и произойдет какая-то
 * ошибка - вылетит этот эксцепшин.
 * @author chemp
 */
public class RetrieveSotialDataFailedException extends ApplicationException{

    public RetrieveSotialDataFailedException(String message) {
        super(message);
    }

    public RetrieveSotialDataFailedException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
