package org.Interface_form;

public interface Queue<E> {

    boolean offer(E e);

    E poll();

    E peek();
}
