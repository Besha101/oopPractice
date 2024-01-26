package org.example.Final.Testing.Week10.Iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

class a2ndTask implements Iterator<Integer> {

    private int[] elements;
    private int currentIndex=0;

    public a2ndTask(int[] elements){
        this.elements=elements;
    }

    @Override
    public boolean hasNext(){
        while (currentIndex< elements.length&&elements[currentIndex]%2==0){
            currentIndex++;
        }
        return currentIndex< elements.length;
    }

    @Override
    public Integer next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return elements[currentIndex++];
    }


    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9};
        a2ndTask iterator=new a2ndTask(numbers);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
