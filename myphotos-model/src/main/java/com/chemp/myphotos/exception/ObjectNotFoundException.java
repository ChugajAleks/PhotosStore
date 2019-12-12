/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.exception;

/**
 * Представитель BuisnessException.
 * Когда был выполнен запрос а объект отсутствует,
 * вылетает этот бизнес эксцепшин.
 * @author chemp
 */
public class ObjectNotFoundException extends BuisnessException{

    public ObjectNotFoundException(String message) {
        super(message);
    }
    
}
