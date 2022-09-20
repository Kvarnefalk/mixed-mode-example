package com.mixed.example;

class Example {
    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    public Example() {
      x = 5;  // Set the initial value for the class attribute x
    } 

    public int doubleUp() {
        return getX() * 2;
    }

    public int getX() {
        return x;
    }
}