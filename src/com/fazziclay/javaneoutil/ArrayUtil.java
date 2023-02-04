package com.fazziclay.javaneoutil;

/**
 * @author FazziCLAY ( <a href="https://fazziclay.github.io">https://fazziclay.github.io</a> )
 * **/
public class ArrayUtil {
    public static <T> void sortByName(T[] list, SortStringConsumer<T> consumer) {
        int n = list.length;
        T temp;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                T oI = list[i];
                T oJ = list[j];

                String s1 = consumer.get(oI);
                String s2 = consumer.get(oJ);
                if (s1 == null) s1 = "";
                if (s2 == null) s2 = "";

                if (s1.compareTo(s2) > 0) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public interface SortStringConsumer<T> {
        String get(T o);
    }

    public static <T> void reverse(T[] list) {
        for (int i = 0; i < list.length; i++) {
            int iRev = list.length - 1 - i;
            T temp = list[i];
            list[i] = list[iRev];
            list[iRev] = temp;
        }
    }
}
