/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanna
 */
public class LinkedList<T> implements ILinkedList<T> {

    private ILinkedList next;
    T data;

    public LinkedList() {
        this.next = null;
        this.data = null;
    }

    public ILinkedList<T> next() {
        return next;

    }//next

    public ILinkedList<T> last() {
        ILinkedList<T> temp = this;
        while (temp.next() != null) {
            
            temp = temp.next();
            

        }
        return temp;

    }

    public ILinkedList<T> after(int n) {
        ILinkedList<T> temp = this;
        if (temp != null) {
            for (int i = 0; i < n; i++) {

                temp = temp.next();
            }
        }
        return temp;

    }

    public ILinkedList<T> detach() {
        ILinkedList<T> remove = next;
        next = null;
        return remove;

    }

    public T get() {
        return data;

    }

    //@Override
    public void set(T value) {
        data = value;
    }

    public void setNext(ILinkedList<T> nextLocal) {
        next = nextLocal;

    }

    public void append(ILinkedList<T> nextLocal) {
        this.last().setNext(nextLocal);
        
    }

    public void insert(ILinkedList<T> newFirst) {

        newFirst.append(this);

    }

}
