package JavaPractice.java;

abstract class Pen {
	 abstract void write();
	abstract void refil();
    void sleep() {          // Concrete method
        System.out.println("Sleeping");
    }

}

interface gelpens {
	void ink();
	void color();
}
class FountainPen  extends Pen implements gelpens {
	
	void write() {
		System.out.println(" writing");

	}
	
	void refil() {
	System.out.println(" refil");

	}
	void changenib() {
		System.out.println(" nib is new");
	}

	//@Override
	public void ink() {
		System.out.println(" gelpen inks");
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}

	

}

public class InterfaceProblem {
 public static void main(String[] args) {
	 FountainPen obj = new FountainPen();
			 obj.changenib();
			 obj.refil();
			 obj.ink();
			 obj.write();
	 
 }
}
