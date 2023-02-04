package ru.fazziclay.javaneoutil;

/**
 * @deprecated use Filter in {@link com.fazziclay.javaneoutil.Filter}
 */
@Deprecated
public interface Filter<T> {
    /**
     * @deprecated This Filter is deprecated. Use new Filter in {@link com.fazziclay.javaneoutil.Filter}
     */
    @Deprecated
    boolean accept(T entry);
}
