package fr.eni.tp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class TypedObserver<T> implements Observer<T> {

    private final Class<T> type;

    @SuppressWarnings("unchecked")
    protected TypedObserver() {
        Type superClass = getClass().getGenericSuperclass();

        if (superClass instanceof ParameterizedType parameterizedType) {
            this.type = (Class<T>) parameterizedType.getActualTypeArguments()[0];
        } else {
            throw new IllegalStateException("Type générique non détectable");
        }
    }

    @Override
    public Class<T> getType() {
        return type;
    }
}
