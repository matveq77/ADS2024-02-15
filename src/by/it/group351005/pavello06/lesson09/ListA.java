package by.it.group351005.pavello06.lesson09;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListA<E> implements List<E>
{

    //Создайте аналог списка БЕЗ использования других классов СТАНДАРТНОЙ БИБЛИОТЕКИ

    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    //////               Обязательные к реализации методы             ///////
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    static int _initialSize = 8;
    E[] _list;
    int _currentItemIndex = 0;

    public ListA()
    {
        this(_initialSize);
    }
    public ListA(int size)
    {
        _list = (E[]) new Object[size];
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append('[');
        for (int i = 0; i < _currentItemIndex; i++)
        {
            sb.append(_list[i]);
            if (i < _currentItemIndex - 1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    @Override
    public boolean add(E e)
    {
        if (_currentItemIndex == _list.length)
        {
            E[] listCopy = (E[]) new Object[_list.length * 2];
            for (int i = 0; i < _list.length; i++)
            {
                listCopy[i] = _list[i];
            }
            _list = listCopy;
        }

        _list[_currentItemIndex] = e;
        _currentItemIndex++;

        return true;
    }

    @Override
    public E remove(int index)
    {
        if (index < 0 || index >= _currentItemIndex)
        {
            return null;
        }

        E removedItem = _list[index];

        for (int i = index; i < _currentItemIndex - 1; i++)
        {
            _list[i] = _list[i + 1];
        }

        _currentItemIndex--;

        return removedItem;
    }

    @Override
    public int size() {
        return _currentItemIndex;
    }

    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    //////               Опциональные к реализации методы             ///////
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////

    @Override
    public void add(int index, E element)
    {
        if (index < 0 || index > _currentItemIndex)
        {
            return;
        }

        if (_currentItemIndex == _list.length)
        {
            E[] listCopy = (E[]) new Object[_list.length * 2];
            for (int i = 0; i < _list.length; i++)
            {
                listCopy[i] = _list[i];
            }
            _list = listCopy;
        }

        for (int i = _currentItemIndex; i > index; i++)
        {
            _list[i] = _list[i - 1];
        }

        _list[index] = element;
        _currentItemIndex++;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }


    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    ////////        Эти методы имплементировать необязательно    ////////////
    ////////        но они будут нужны для корректной отладки    ////////////
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    @Override
    public Iterator<E> iterator() {
        return null;
    }

}
