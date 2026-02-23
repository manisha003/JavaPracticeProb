
package JavaPractice.java;

/**
 * Hello world!
 *
 */
public class Greeter 
{
	public static String greet(String name) {
		return " Hello! " + name;
	}
	 
    public static void main( String[] args )
    {
    	String msg = Greeter.greet("manisha");
        System.out.println( msg );
    }
}

