package org.example.Final.Testing.Week10.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

class a1stTask {

    //IteratorExample

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Besha");
        list.add("Alic");
        list.add("Ferhat");


        Iterator<String> iterator=list.iterator();

        while (iterator.hasNext()){
            String name= iterator.next();
            System.out.println(name);
        }
    }


}
