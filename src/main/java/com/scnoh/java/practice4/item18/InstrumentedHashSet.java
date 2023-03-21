package com.scnoh.java.practice4.item18;

import java.util.Collection;
import java.util.HashSet;

/**
 * HashSet을 상속했을 때의 문제점
 *  1. add, addAll을 재정의 했을 때 발생되는 문제점 - addAll 메서드는 add를 원소 수 만큼 호출한다.
 *  2. 해결 방법으로는 add 또는 addAll을 재정의 하지 않는 것이다. 또는, 컴포지션을 사용해라.
 *
 * @param <E>
 */

public class InstrumentedHashSet<E> extends HashSet<E> {

    // 추가된 원소의 수
    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    /**
     * addAll 메서드는 AbstractCollection 구현체에서 전달 받은 Set의 원소들의 수 만큼 add 메서드를 호출하여 저장하는 방식이다.
     *
     * @param c collection containing elements to be added to this collection
     * @return
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
