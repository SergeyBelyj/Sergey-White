package Generic;

import java.lang.reflect.ParameterizedType;
import java.util.Iterator;

public class SimpleList<T> implements Iterable<T>{


    Object[] objects;
    int index = 0;

    public SimpleList(int size) {
        this.objects = new Object[size];
        /*
        Class<T> t = (Class <T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
       try {
           T value = t.newInstance();
         } catch (Exception e) {
        e.printStackTrace();
       }
         */
    }

    public void add(T value) {
    this.objects[index++] = value;
    }
    public T get(int position) {
        return (T) this.objects[position];
    }
    public void set(int index, T list) {
        this.objects[index] = list;
    }
    public void delete(int inedx) {
        this.objects[inedx] = null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
