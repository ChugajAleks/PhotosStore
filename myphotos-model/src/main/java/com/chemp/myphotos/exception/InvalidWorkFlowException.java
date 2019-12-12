/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.exception;

/**
 * Представитель BuisnessException. 
 * Если во время работы что-то пошло не так, некоректное поведение.
 * @author chemp
 */
public class InvalidWorkFlowException extends BuisnessException{

    public InvalidWorkFlowException(String message) {
        super(message);
    }
    
    
}
