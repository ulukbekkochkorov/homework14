package com.company;

public class Class {

    private String word;
    private int namber;
    private int [] nambers;
    public void setWord (String word1){
        word = word1;
    }public String getWord () {
        return word;
    }
    public void setNamber (int namber1) {
        namber = namber1;
    }public int getNamber () {
        return namber;
    }
    public void setNambers ( int [] nambers1){
        nambers = nambers1;
    }public void getNambers () {
        for (int i = 0; i < nambers.length; i++)
            System.out.print(nambers[i]+"; ");
        }
}
