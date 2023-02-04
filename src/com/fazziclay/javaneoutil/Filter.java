package com.fazziclay.javaneoutil;

public interface Filter<T> {
    boolean accept(T entry);
}
