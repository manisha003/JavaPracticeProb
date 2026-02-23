package JavaPractice.java;

public class StaticExample {
    static int count = 0; // Static variable

    static { // Static block
        System.out.println("Static block executed!");
    }

    public StaticExample() {
        count++; // Increment count for every new instance
    }

    static void displayCount() { // Static method
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
      // StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();
       // obj1.displayCount();
        obj3.displayCount();
        
        StaticExample.displayCount(); // Call static method
    }
}

