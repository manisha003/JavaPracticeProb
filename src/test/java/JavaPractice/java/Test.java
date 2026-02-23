package JavaPractice.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestCase;
import junit.framework.TestSuite;

 class Test1 {
    // Instance variables
    int myInt; 
    String myString;
    
    public void printDefaults() {
        System.out.println("Default value of int: " + myInt); // 0
        System.out.println("Default value of String: " + myString); // null
    }
}

public class Test{
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.printDefaults(); // It will print the default values
    }


    }


