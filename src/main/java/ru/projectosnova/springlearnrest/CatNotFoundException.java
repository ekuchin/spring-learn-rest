package ru.projectosnova.springlearnrest;

public class CatNotFoundException extends RuntimeException {
    public CatNotFoundException(Long id) {

        super("Нет такого кота: " + id);

    }
}
