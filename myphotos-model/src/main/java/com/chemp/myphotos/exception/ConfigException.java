/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.exception;

/**
 * Отвечает за все ошибки конфигурации в приложении
 * @author chemp
 */
public class ConfigException extends ApplicationException{

    public ConfigException(String message) {
        super(message);
    }

    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
