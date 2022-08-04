package ru.fazziclay.javaneoutil;

/**
MIT License

Copyright (c) 2022 Mironov Stanislav (FazziCLAY)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
**/

/**
 * Набот утилит для сортировки
 * @author FazziCLAY ( https://fazziclay.github.io )
 * **/
public class ArrayUtil {
    /**
     * Перерасположить(сортировать) массив list по тексту элемента, тест достаётся с помощью {@link SortStringConsumer}
     * **/
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
