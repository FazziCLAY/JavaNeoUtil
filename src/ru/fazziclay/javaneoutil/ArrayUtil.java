package ru.fazziclay.javaneoutil;

/**
 * @deprecated use new ArrayUtil in {@link com.fazziclay.javaneoutil.ArrayUtil}
 * **/
@Deprecated
public class ArrayUtil {
    /**
     * @deprecated use new ArrayUtil in {@link com.fazziclay.javaneoutil.ArrayUtil}
     * **/
    public static <T> void sortByName(T[] list, SortStringConsumer<T> consumer) {
        com.fazziclay.javaneoutil.ArrayUtil.sortByName(list, consumer::get);
    }

    /**
     * @deprecated use new ArrayUtil in {@link com.fazziclay.javaneoutil.ArrayUtil}
     * **/
    public interface SortStringConsumer<T> {

        /**
         * @deprecated use new ArrayUtil in {@link com.fazziclay.javaneoutil.ArrayUtil}
         * **/
        String get(T o);
    }

    /**
     * @deprecated use new ArrayUtil in {@link com.fazziclay.javaneoutil.ArrayUtil}
     * **/
    public static <T> void reverse(T[] list) {
        com.fazziclay.javaneoutil.ArrayUtil.reverse(list);
    }
}
