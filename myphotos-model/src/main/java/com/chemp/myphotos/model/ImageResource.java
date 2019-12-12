/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemp.myphotos.model;

import javax.validation.Path;

/**
 * Объект модели который представляет медиа ресурс
 * @author chemp
 */
public interface ImageResource extends AutoCloseable{
    /*для промежуточного хранения информации используем Path потому что нам нужно
    использовать разные варианты размера картинки (картинка загружаемая на сервер
    будет ресайзится в несколько размеров и сохранятся). Все библиотеки для  ресайза 
    картинок хорошо используют временный файл поэтому используется Path
    Если бы ресайза небало можно было использовать InputStream - более универсальное решение*/
    Path getTempPath();
    
    @Override
    void close();
    
}
