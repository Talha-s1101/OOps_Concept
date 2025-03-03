package com.MultipleInheritance;

public class Class3 extends Class2{
    public void son(){
        System.out.println("This is son of father, and grandson of grandfather.");
    }
    public static void main(String[] args) {
        Class3 c = new Class3();
        c.grandFather();
        c.father();
        c.son();
    }
}
