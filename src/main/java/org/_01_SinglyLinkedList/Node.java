package org._01_SinglyLinkedList;

// commit test 위한 주석 코드1
class Node<E> {

    E data;
    Node<E> next;

    Node(E data){
        this.data = data;
        this.next = null;
    }
}
