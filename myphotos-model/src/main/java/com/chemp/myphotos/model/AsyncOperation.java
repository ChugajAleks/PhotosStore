/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.model;

/**
 * Чтобы загрузить новую фотографию или обновить аватарку, все эти операции выполняются
 * с помощью асинхронных сервлетов. AsyncOperation - это объект модели который представляет 
 * асинхронную операцию.
 * @author chemp
 */
public interface AsyncOperation<T> {
    /*Возврашает таймаут асинхронной операции в милисекундах*/
    long getTimeOutInMillis();
    
    void onSuccess(T result);
    
    void onFailed(Throwable throwable);
    
}
