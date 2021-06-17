package util;

public interface Filter<T>{
    public abstract boolean check(T item);
}
