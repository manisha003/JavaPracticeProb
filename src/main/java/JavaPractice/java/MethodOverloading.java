package JavaPractice.java;

class Greet {
	void greetings() {
		System.out.println("hello good morning");
	}
	
	void greetings( String name) {
		System.out.println(name + " hello good morning");
	}

	void greetings(String name, int count) {
		for(int i=0; i<count; i++) {
			System.out.println(name + " hello good morning" );
	
		}
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
          Greet obj = new Greet();
          obj.greetings();
          obj.greetings("manisha");
          obj.greetings("manisha", 5);

	}
	 

	
}
