package com.OOPS.Inheritance.singleLevel;

public class Inherited extends SingleLevelInheritance{
        public void son() {
               System.out.println("this is son, Inheriting the property of the father.");
        }

        public static void main(String[] args) {
                Inherited i = new Inherited();
                i.father();
                i.son();
        }
}
