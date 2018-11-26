package HW16LinkedList.LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    @Override
    public Iterator<T> iterator() {
        final LinkedList<T> list = this;
        return new Iterator<T>() {
            final Node<T> firstNode = list.getFirst();
            Node<T> currentNode = null;
            @Override
            public boolean hasNext() {
                if (list.isEmpty()) {
                    return false;
                } else if (currentNode == null){
                    return true;
                } else if (currentNode == list.getLast()){
                    return false;
                }
                return true;
            }
            @Override
            public T next() {
                if (list.isEmpty()){
                    throw new NoSuchElementException();
                } else if (currentNode == null){
                    this.currentNode = firstNode;
                    return currentNode.getElement();
                } else if (currentNode.getNext() == null) {
                    throw new NoSuchElementException();
                }
                this.currentNode = currentNode.getNext();
                return currentNode.getElement();
            }
        };
    }

    private class Node<T> {
        public Node(T element, Node<T> prev, Node<T> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        private T element;
        private Node<T> prev;
        private Node<T> next;

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean add(T t) {
        Node<T> newElement = new Node<>(t, this.last, null);
        Node<T> last = this.last;
        this.last = newElement;
        if (last == null) {
            this.first = newElement;
        } else {
            last.setNext(newElement);
        }
        this.size++;
        return true;
    }

    public void add(int index, T element) {
        if (this.isEmpty() || index == this.size) {
            checkIndex(index);
            this.add(element);
        } else {
            Node<T> current = getNode(index);
            Node<T> addingElement = new Node<>(element, current.getPrev(), current);
            this.size++;
            current.getPrev().setNext(addingElement);
            current.setPrev(addingElement);
        }
    }

    public boolean addAll(Collection<? extends T> c) {
        for (T t : c) {
            add(t);
        }
        return true;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        if (this.isEmpty() || index == this.size) {
            checkIndex(index);
            this.addAll(c);
        } else {
            for (T element : c) {
                this.add(index, element);
                index++;
            }
        }
        return true;
    }

    public void clear() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    public T get(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        T el = null;
        Node<T> current = getNode(index);
        if (current != null) {
            el = current.getElement();
        }
        return el;
    }

    public Node<T> getFirst() {
        return this.first;
    }

    public Node<T> getLast() {
        return this.last;
    }

    private Node<T> getNode(int index) {
        checkIndex(index);
        int counter = 0;
        Node<T> current = this.first;
        while (counter != index) {
            counter++;
            current = current.getNext();
        }
        return current;
    }

    private Node<T> getNode(Object o) {
        Node<T> current = this.first;
        if (current != null) {
            int counter = 0;
            while (counter < this.getSize()) {
                if (current.getElement().equals(o)) {
                    return current;
                }
                current = current.getNext();
                counter++;
            }
        }
        return current;
    }

    private void checkIndex(int index) {
        if (this.isEmpty()) {
            if (index > 0) {
                throw new IndexOutOfBoundsException();
            }
        } else if (index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (index < 0) {
            throw new NegativeArraySizeException();
        }
    }

    public T set(int index, T element) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = getNode(index);
        T prevElement = current.getElement();
        current.setElement(element);
        return prevElement;
    }

    private void deleteLink(Node<T> current, Node<T> prev, Node<T> next) {
        if (prev == null) {
            this.first = next;
        } else {
            prev.setNext(next);
            current.setPrev(null);
        }
        if (next == null) {
            this.last = prev;
        } else {
            next.setPrev(prev);
            current.setNext(null);
        }
        current.setElement(null);
    }

    public T remove(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = getNode(index);
        Node<T> prev = current.getPrev();
        Node<T> next = current.getNext();
        T element = current.getElement();
        deleteLink(current, prev, next);
        this.size--;
        return element;
    }

    public boolean remove(Object o) {
        Node<T> current = getNode(o);
        if (current == null) {
            return false;
        } else {
            Node<T> prev = current.getPrev();
            Node<T> next = current.getNext();
            deleteLink(current, prev, next);
            this.size--;
            return true;
        }
    }

    public boolean removeAll(Collection<?> c) {
        boolean result = false;
        for (Object o : c) {
            if (this.remove(o)) {
                result = true;
            }
        }
        return result;
    }

    public boolean retainAll(Collection<?> c) {
        boolean result = false;
        for (T element : this) {
            if (!c.contains(element)) {
                if (this.remove(element)) {
                    result = true;
                }
            }
        }
        return result;
    }

    public int indexOf(Object o) {
        if (this.isEmpty()) {
            return -1;
        }
        int counter = 0;
        Node<T> current = this.first;
        while (current.getElement() != o) {
            counter++;
            current = current.getNext();
            if (counter == this.size) {
                return -1;
            }
        }
        return counter;
    }

    public int lastIndexOf(Object o) {
        if (this.isEmpty()) {
            return -1;
        }
        int counter = 1;
        Node<T> current = this.last;
        while (current.getElement() != o) {
            counter++;
            current = current.getPrev();
            if (counter == this.size) {
                return -1;
            }
        }

        return this.size - counter;
    }

    public boolean contains(Object o) {
        for (T element : this) {
            if (o.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        if (c.isEmpty()) {
            return false;
        }
        for (Object o : c) {
            if (!this.contains(o)) {
                return false;
            }
        }
        return true;
    }

    public Object[] toArray() {
        Object[] array = new Object[this.getSize()];
        for (int i = 0; i < this.getSize(); i++) {
            array[i] = this.get(i);
        }
        return array;
    }

    public LinkedList<T> subList(int fromIndex, int toIndex) {
        if (fromIndex >= this.getSize() || toIndex >= this.getSize()) {
            throw new IndexOutOfBoundsException();
        }
        checkIndex(fromIndex);
        checkIndex(toIndex);
        LinkedList<T> newList = new LinkedList<T>();
        for (int i = fromIndex; i <= toIndex; i++) {
            newList.add(this.get(i));
        }
        return newList;
    }

}
