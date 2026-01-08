package fr.eni.tp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface Observer<T> {

    public void onChange(String key, T data);

    public Class<T> getType();

}
