package com.scnoh.java.practice4.item18;

import java.awt.*;
import java.util.*;
import java.util.List;

public class CompositionHashSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public CompositionHashSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
}
