package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Class class1 = new Class();
    int [] nambers = {1,2,3,4,5};
    class1.setWord("Hello world");
    class1.setNamber(7);
    class1.setNambers(nambers);
        System.out.println(class1.getWord());
        System.out.println(class1.getNamber());
        class1.getNambers();
    }
}
