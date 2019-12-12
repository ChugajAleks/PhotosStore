/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.exception;

/**
 * Абстрактный класс который будет говорить что произошла ошибка связанная с бизнес правилами 
 * приложения (объект отсутствует, нарушена логика, некоректные данные и т.д.). 
 * Посути эти эксепшины будут маркерными т.е не будет генерировать stackTrase.
 * В бизнес модуле нету смысла тратить ресурсы на заполнение стектрейса.
 * @author chemp
 */
public abstract class BuisnessException extends ApplicationException{
    
    /*чтобы не выводился stackTrase используем конструктор предка у которого в параметре 
    можно отключить стектрейс*/
    public BuisnessException(String message){
        super(message, null, true, false);
    }
    
}
