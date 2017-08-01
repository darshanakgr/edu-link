package edu.sliit.edulink.iterator;

import android.graphics.drawable.Drawable;

/**
 * Created by drox on 8/1/2017.
 */

public class Iterator<T> {
    private T[] arr;
    private int count = 0;
    public Iterator(T[] arr) {
        this.arr = arr;
    }

    public boolean hasNext(){
        return count <= arr.length - 1;
    }

    public boolean hasPrevious(){
        return count > 1 && arr.length != 0;
    }

    public T next(){
        return arr[count++];
    }

    public T previous(){
        return arr[(count--) - 2];
    }
}
