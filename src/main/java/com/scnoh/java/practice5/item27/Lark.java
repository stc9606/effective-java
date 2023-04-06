package com.scnoh.java.practice5.item27;

import java.util.Arrays;

public class Lark<T> {
    private static final Integer size = 10;
    private T[] elements;

    /**
     * ArraysList
     * @param a
     * @return
     * @param <T>
     */
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            // 생성한 배열과 매개변수로 받은 배열의 타입이 모두 T[]로 같으므로 올바른 형변환이다.
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
}
